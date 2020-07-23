# Copyright (c) 2011, 2018 Oracle and/or its affiliates.  All rights reserved.
#
# See the file LICENSE for license information.
#
# TEST	repmgr033
# TEST	Under quorum policy, if the number of peers in the group is less than a
# TEST	majority, that's still OK.

proc repmgr033 { { tnum "033" } args } {

	source ./include.tcl 

	if { $is_freebsd_test == 1 } { 
		puts "Skipping replication manager test on FreeBSD."
		return
	}

	set method "btree"
	set args [convert_args $method $args]
	
	puts "Repmgr$tnum: Test quorum policy when the number of peers\
	    is less than a majority."
	repmgr033_sub $method $tnum $args
}

proc repmgr033_sub { method tnum largs } {
	global rep_verbose
	global testdir
	global ipversion

	set rv off
	if { $rep_verbose == 1 } {
		set rv on
	}

	env_cleanup $testdir
	foreach {portA portB portC portD portE} [available_ports 5] {}
	set hoststr [get_hoststr $ipversion]

	set dirA $testdir/A
	set dirB $testdir/B
	set dirC $testdir/C
	set dirD $testdir/D
	set dirE $testdir/E

	file mkdir $dirA
	file mkdir $dirB
	file mkdir $dirC
	file mkdir $dirD
	file mkdir $dirE

	setup_repmgr_ssl $dirA
	setup_repmgr_ssl $dirB
	setup_repmgr_ssl $dirC
	setup_repmgr_ssl $dirD
	setup_repmgr_ssl $dirE
    
	puts -nonewline "\tRepmgr$tnum: Set up a group of 5"
	set envA [berkdb env -create -errpfx A -home $dirA -txn -rep -thread \
	    -verbose [list rep $rv] -event]
	$envA repmgr -local [list $hoststr $portA] -start master
	puts -nonewline "." ; flush stdout

	set envB [berkdb env -create -errpfx B -home $dirB -txn -rep -thread \
	    -verbose [list rep $rv]]
	$envB repmgr -local [list $hoststr $portB] \
	    -remote [list $hoststr $portA] -start client
	await_startup_done $envB
	puts -nonewline "." ; flush stdout

	# These last three clients have priority 0, making them unelectable. 
	set envC [berkdb env -create -errpfx C -home $dirC -txn -rep -thread \
	    -verbose [list rep $rv]]
	$envC repmgr -local [list $hoststr $portC] \
	    -remote [list $hoststr $portA] -start client -pri 0
	await_startup_done $envC
	puts -nonewline "." ; flush stdout

	set envD [berkdb env -create -errpfx D -home $dirD -txn -rep -thread \
	    -verbose [list rep $rv]]
	$envD repmgr -local [list $hoststr $portD] \
	    -remote [list $hoststr $portA] -start client -pri 0
	await_startup_done $envD
	puts -nonewline "." ; flush stdout

	set envE [berkdb env -create -errpfx E -home $dirE -txn -rep -thread \
	    -verbose [list rep $rv]]
	$envE repmgr -local [list $hoststr $portE] \
	    -remote [list $hoststr $portA] -pri 0 -start client
	await_startup_done $envE
	puts "."

	puts "\tRepmgr$tnum: Write updates and check perm_failed event"
	$envA event_info -clear
	set niter 1
	rep_test $method $envA NULL $niter 0 0 0 $largs
	error_check_good nofailure \
	    [string length [find_event [$envA event_info] perm_failed]] 0

	# If site B, the only other electable site, is missing, then we should
	# get a perm failure, because the other clients' acks are worthless.
	$envB close
	rep_test $method $envA NULL $niter 0 0 0 $largs
	error_check_bad failure \
	    [string length [find_event [$envA event_info] perm_failed]] 0

	# Clean up.
	$envE close
	$envD close
	$envC close
	$envA close
}

/*-
 * Copyright (c) 2010, 2018 Oracle and/or its affiliates.  All rights reserved.
 *
 * See the file LICENSE for license information.
 */

#include "sqliteInt.h"

int sqlite3PcacheInitialize(void){ return SQLITE_OK; }
void sqlite3PcacheShutdown(void){}
void sqlite3PCacheBufferSetup(void *p, int sz, int n) {}
void sqlite3PCacheSetDefault(void){}
#ifdef SQLITE_TEST
void sqlite3PcacheStats(int *a,int *b,int *c,int *d) {}
#endif

int sqlite3HeaderSizePcache(void){ return SQLITE_OK; }
int sqlite3HeaderSizePcache1(void){ return SQLITE_OK; }
sqlite3_mutex *sqlite3Pcache1Mutex(void){ return 0; }
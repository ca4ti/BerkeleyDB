//------------------------------------------------------------------------------
// <auto-generated />
//
// This file was automatically generated by SWIG (http://www.swig.org).
// Version 3.0.12
//
// Do not make changes to this file unless you know what you are doing--modify
// the SWIG interface file instead.
//------------------------------------------------------------------------------

namespace BerkeleyDB.Internal {

using global::System;
using global::System.Runtime.InteropServices;

internal class DBT : global::System.IDisposable {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  protected bool swigCMemOwn;

  internal DBT(global::System.IntPtr cPtr, bool cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(DBT obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  ~DBT() {
    Dispose();
  }

  public virtual void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          libdb_csharpPINVOKE.delete_DBT(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      global::System.GC.SuppressFinalize(this);
    }
  }

	internal IntPtr dataPtr {
		get {
			return libdb_csharpPINVOKE.DBT_data_get(swigCPtr);
		}
		set {
			libdb_csharpPINVOKE.DBT_data_set(swigCPtr, value);
		}
	}

  internal uint dlen {
    set {
      libdb_csharpPINVOKE.DBT_dlen_set(swigCPtr, value);
    } 
    get {
      uint ret = libdb_csharpPINVOKE.DBT_dlen_get(swigCPtr);
      return ret;
    } 
  }

  internal uint doff {
    set {
      libdb_csharpPINVOKE.DBT_doff_set(swigCPtr, value);
    } 
    get {
      uint ret = libdb_csharpPINVOKE.DBT_doff_get(swigCPtr);
      return ret;
    } 
  }

  internal uint flags {
    set {
      libdb_csharpPINVOKE.DBT_flags_set(swigCPtr, value);
    } 
    get {
      uint ret = libdb_csharpPINVOKE.DBT_flags_get(swigCPtr);
      return ret;
    } 
  }

  internal uint size {
    set {
      libdb_csharpPINVOKE.DBT_size_set(swigCPtr, value);
    } 
    get {
      uint ret = libdb_csharpPINVOKE.DBT_size_get(swigCPtr);
      return ret;
    } 
  }

  internal uint ulen {
    set {
      libdb_csharpPINVOKE.DBT_ulen_set(swigCPtr, value);
    } 
    get {
      uint ret = libdb_csharpPINVOKE.DBT_ulen_get(swigCPtr);
      return ret;
    } 
  }

  internal byte[] data {
	set {
		IntPtr _data = Marshal.AllocHGlobal(value.Length);
        Marshal.Copy(value, 0, _data, value.Length);
        libdb_csharpPINVOKE.DBT_data_set(swigCPtr, _data);
        size = (uint)value.Length;
	}

	get {
		IntPtr datap = libdb_csharpPINVOKE.DBT_data_get(swigCPtr);
		int sz = (int)size;
		byte[] ret = new byte[sz];
		Marshal.Copy(datap, ret, 0, sz);
		return ret;
	}

  }

  internal DatabaseEntry app_data {
    set {
      libdb_csharpPINVOKE.DBT_app_data_set(swigCPtr, value);
    } 
		get { return libdb_csharpPINVOKE.DBT_app_data_get(swigCPtr); }
	
  }

  internal DBT() : this(libdb_csharpPINVOKE.new_DBT(), true) { 
		flags = DbConstants.DB_DBT_USERCOPY;
	} 
}

}

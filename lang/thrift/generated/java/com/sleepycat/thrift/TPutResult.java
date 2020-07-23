/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.sleepycat.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-08-25")
public class TPutResult implements org.apache.thrift.TBase<TPutResult, TPutResult._Fields>, java.io.Serializable, Cloneable, Comparable<TPutResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TPutResult");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField NEW_RECORD_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("newRecordNumber", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TPutResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TPutResultTupleSchemeFactory();

  /**
   * 
   * @see TOperationStatus
   */
  public TOperationStatus status; // required
  public java.nio.ByteBuffer newRecordNumber; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see TOperationStatus
     */
    STATUS((short)1, "status"),
    NEW_RECORD_NUMBER((short)2, "newRecordNumber");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // STATUS
          return STATUS;
        case 2: // NEW_RECORD_NUMBER
          return NEW_RECORD_NUMBER;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.NEW_RECORD_NUMBER};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TOperationStatus.class)));
    tmpMap.put(_Fields.NEW_RECORD_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("newRecordNumber", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TPutResult.class, metaDataMap);
  }

  public TPutResult() {
  }

  public TPutResult(
    TOperationStatus status)
  {
    this();
    this.status = status;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TPutResult(TPutResult other) {
    if (other.isSetStatus()) {
      this.status = other.status;
    }
    if (other.isSetNewRecordNumber()) {
      this.newRecordNumber = org.apache.thrift.TBaseHelper.copyBinary(other.newRecordNumber);
    }
  }

  public TPutResult deepCopy() {
    return new TPutResult(this);
  }

  @Override
  public void clear() {
    this.status = null;
    this.newRecordNumber = null;
  }

  /**
   * 
   * @see TOperationStatus
   */
  public TOperationStatus getStatus() {
    return this.status;
  }

  /**
   * 
   * @see TOperationStatus
   */
  public TPutResult setStatus(TOperationStatus status) {
    this.status = status;
    return this;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public byte[] getNewRecordNumber() {
    setNewRecordNumber(org.apache.thrift.TBaseHelper.rightSize(newRecordNumber));
    return newRecordNumber == null ? null : newRecordNumber.array();
  }

  public java.nio.ByteBuffer bufferForNewRecordNumber() {
    return org.apache.thrift.TBaseHelper.copyBinary(newRecordNumber);
  }

  public TPutResult setNewRecordNumber(byte[] newRecordNumber) {
    this.newRecordNumber = newRecordNumber == null ? (java.nio.ByteBuffer)null : java.nio.ByteBuffer.wrap(newRecordNumber.clone());
    return this;
  }

  public TPutResult setNewRecordNumber(java.nio.ByteBuffer newRecordNumber) {
    this.newRecordNumber = org.apache.thrift.TBaseHelper.copyBinary(newRecordNumber);
    return this;
  }

  public void unsetNewRecordNumber() {
    this.newRecordNumber = null;
  }

  /** Returns true if field newRecordNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetNewRecordNumber() {
    return this.newRecordNumber != null;
  }

  public void setNewRecordNumberIsSet(boolean value) {
    if (!value) {
      this.newRecordNumber = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((TOperationStatus)value);
      }
      break;

    case NEW_RECORD_NUMBER:
      if (value == null) {
        unsetNewRecordNumber();
      } else {
        if (value instanceof byte[]) {
          setNewRecordNumber((byte[])value);
        } else {
          setNewRecordNumber((java.nio.ByteBuffer)value);
        }
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS:
      return getStatus();

    case NEW_RECORD_NUMBER:
      return getNewRecordNumber();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case STATUS:
      return isSetStatus();
    case NEW_RECORD_NUMBER:
      return isSetNewRecordNumber();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TPutResult)
      return this.equals((TPutResult)that);
    return false;
  }

  public boolean equals(TPutResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_newRecordNumber = true && this.isSetNewRecordNumber();
    boolean that_present_newRecordNumber = true && that.isSetNewRecordNumber();
    if (this_present_newRecordNumber || that_present_newRecordNumber) {
      if (!(this_present_newRecordNumber && that_present_newRecordNumber))
        return false;
      if (!this.newRecordNumber.equals(that.newRecordNumber))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetStatus()) ? 131071 : 524287);
    if (isSetStatus())
      hashCode = hashCode * 8191 + status.getValue();

    hashCode = hashCode * 8191 + ((isSetNewRecordNumber()) ? 131071 : 524287);
    if (isSetNewRecordNumber())
      hashCode = hashCode * 8191 + newRecordNumber.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TPutResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetNewRecordNumber()).compareTo(other.isSetNewRecordNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNewRecordNumber()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.newRecordNumber, other.newRecordNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TPutResult(");
    boolean first = true;

    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (isSetNewRecordNumber()) {
      if (!first) sb.append(", ");
      sb.append("newRecordNumber:");
      if (this.newRecordNumber == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.newRecordNumber, sb);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TPutResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TPutResultStandardScheme getScheme() {
      return new TPutResultStandardScheme();
    }
  }

  private static class TPutResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<TPutResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TPutResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.status = com.sleepycat.thrift.TOperationStatus.findByValue(iprot.readI32());
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NEW_RECORD_NUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.newRecordNumber = iprot.readBinary();
              struct.setNewRecordNumberIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TPutResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        oprot.writeI32(struct.status.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.newRecordNumber != null) {
        if (struct.isSetNewRecordNumber()) {
          oprot.writeFieldBegin(NEW_RECORD_NUMBER_FIELD_DESC);
          oprot.writeBinary(struct.newRecordNumber);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TPutResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TPutResultTupleScheme getScheme() {
      return new TPutResultTupleScheme();
    }
  }

  private static class TPutResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<TPutResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TPutResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetStatus()) {
        optionals.set(0);
      }
      if (struct.isSetNewRecordNumber()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetStatus()) {
        oprot.writeI32(struct.status.getValue());
      }
      if (struct.isSetNewRecordNumber()) {
        oprot.writeBinary(struct.newRecordNumber);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TPutResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.status = com.sleepycat.thrift.TOperationStatus.findByValue(iprot.readI32());
        struct.setStatusIsSet(true);
      }
      if (incoming.get(1)) {
        struct.newRecordNumber = iprot.readBinary();
        struct.setNewRecordNumberIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}


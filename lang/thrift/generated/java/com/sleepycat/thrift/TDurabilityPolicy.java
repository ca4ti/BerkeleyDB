/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.sleepycat.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum TDurabilityPolicy implements org.apache.thrift.TEnum {
  NO_SYNC(1),
  SYNC(2),
  WRITE_NO_SYNC(3);

  private final int value;

  private TDurabilityPolicy(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static TDurabilityPolicy findByValue(int value) { 
    switch (value) {
      case 1:
        return NO_SYNC;
      case 2:
        return SYNC;
      case 3:
        return WRITE_NO_SYNC;
      default:
        return null;
    }
  }
}

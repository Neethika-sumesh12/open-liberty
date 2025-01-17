// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Store.proto

// Protobuf Java Version: 3.25.5
package com.ibm.test.g3store.grpc;

/**
 * Protobuf enum {@code SecurityType}
 */
public enum SecurityType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * default
   * </pre>
   *
   * <code>NO_SECURITY = 0;</code>
   */
  NO_SECURITY(0),
  /**
   * <code>BASIC = 1;</code>
   */
  BASIC(1),
  /**
   * <code>TOKEN_JWT = 2;</code>
   */
  TOKEN_JWT(2),
  /**
   * <code>TOKEN_OAUTH2 = 3;</code>
   */
  TOKEN_OAUTH2(3),
  /**
   * <code>CUSTOM_AUTH = 4;</code>
   */
  CUSTOM_AUTH(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * default
   * </pre>
   *
   * <code>NO_SECURITY = 0;</code>
   */
  public static final int NO_SECURITY_VALUE = 0;
  /**
   * <code>BASIC = 1;</code>
   */
  public static final int BASIC_VALUE = 1;
  /**
   * <code>TOKEN_JWT = 2;</code>
   */
  public static final int TOKEN_JWT_VALUE = 2;
  /**
   * <code>TOKEN_OAUTH2 = 3;</code>
   */
  public static final int TOKEN_OAUTH2_VALUE = 3;
  /**
   * <code>CUSTOM_AUTH = 4;</code>
   */
  public static final int CUSTOM_AUTH_VALUE = 4;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static SecurityType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SecurityType forNumber(int value) {
    switch (value) {
      case 0: return NO_SECURITY;
      case 1: return BASIC;
      case 2: return TOKEN_JWT;
      case 3: return TOKEN_OAUTH2;
      case 4: return CUSTOM_AUTH;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SecurityType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SecurityType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SecurityType>() {
          public SecurityType findValueByNumber(int number) {
            return SecurityType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.ibm.test.g3store.grpc.StoreProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final SecurityType[] VALUES = values();

  public static SecurityType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private SecurityType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:SecurityType)
}


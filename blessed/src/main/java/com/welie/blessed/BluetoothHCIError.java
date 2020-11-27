package com.welie.blessed;

public enum BluetoothHCIError {
    SUCCESS(0x00),
    UNKNOWN_COMMAND(0x01),
    UNKNOWN_CONNECTION_IDENTIFIER(0x02),
    HARDWARE_FAILURE(0x03),
    PAGE_TIMEOUT(0x04),
    AUTHENTICATION_FAILURE(0x05),
    PIN_OR_KEY_MISSING(0x06),
    MEMORY_FULL(0x07),
    CONNECTION_TIMEOUT(0x08),
    CONNMECTION_LIMIT_EXCEEDED(0x09),
    MAX_NUM_OF_CONNECTIONS_EXCEEDED(0x0A),
    CONNECTION_ALREADY_EXISTS(0x0B),
    COMMAND_DISALLOWED(0x0C),
    CONNECTION_REJECTED_LIMITED_RESOURCES(0x0D),
    CONNECTION_REJECTED_SECURITY_REASONS(0x0E),
    CONNECTION_REJECTED_UNACCEPTABLE_MAC_ADDRESS(0x0F),
    CONNECTION_ACCEPT_TIMEOUT_EXCEEDED(0x10),
    UNSUPPORTED_PARAMETER_VALUE(0x11),
    INVALID_COMMAND_PARAMETERS(0x12),
    REMOTE_USER_TERMINATED_CONNECTION(0x13),
    REMOTE_DEVICE_TERMINATED_CONNECTION_LOW_RESOURCES(0x14),
    REMOTE_DEVICE_TERMINATED_CONNECTION_POWER_OFF(0x15),
    CONNECTION_TERMINATED_BY_LOCAL_HOST(0x16),
    REPEATED_ATTEMPTS(0x17),
    PAIRING_NOT_ALLOWED(0x18),
    UNKNOWN_LMP_PDU(0x19),
    UNSUPPORTED_REMOTE_FEATURE(0x1A),
    SCO_OFFSET_REJECTED(0x1B),
    SCO_INTERVAL_REJECTED(0x1C),
    SCO_AIR_MODE_REJECTED(0x1D),
    INVALID_LMP_OR_LL_PARAMETERS(0x1E),
    UNSPECIFIED(0x1F),
    UNSUPPORTED_LMP_OR_LL_PARAMETER_VALUE(0x20),
    ROLE_CHANGE_NOT_ALLOWED(0x21),
    LMP_OR_LL_RESPONSE_TIMEOUT(0x22),
    LMP_OR_LL_ERROR_TRANS_COLLISION(0x23),
    LMP_PDU_NOT_ALLOWED(0x24),
    ENCRYPTION_MODE_NOT_ACCEPTABLE(0x25),
    LINK_KEY_CANNOT_BE_EXCHANGED(0x26),
    REQUESTED_QOS_NOT_SUPPORTED(0x27),
    INSTANT_PASSED(0x28),
    PAIRING_WITH_UNIT_KEY_NOT_SUPPORTED(0x29),
    DIFFERENT_TRANSACTION_COLLISION(0x2A),
    UNDEFINED_0x2B(0x2B),
    QOS_UNACCEPTABLE_PARAMETER(0x2C),
    QOS_REJECTED(0x2D),
    CHANNEL_CLASSIFICATION_NOT_SUPPORTED(0x2E),
    INSUFFCIENT_SECURITY(0x2F),
    PARAMAMETER_OUT_OF_RANGE(0x30),
    UNDEFINED_0x31(0x31),
    ROLE_SWITCH_PENDING(0x32),
    UNDEFINED_0x33(0x33),
    RESERVED_SLOT_VIOLATION(0x34),
    ROLE_SWITCH_FAILED(0x35),
    INQUIRY_RESPONSE_TOO_LARGE(0x36),
    SECURE_SIMPLE_PAIRING_NOT_SUPPORTED(0x37),
    HOST_BUSY_PAIRING(0x38),
    CONNECTION_REJECTED_NO_SUITABLE_CHANNEL(0x39),
    CONTROLLER_BUSY(0x3A),
    UNACCEPTABLE_CONNECTION_PARAMETERS(0x3B),
    ADVERTISING_TIMEOUT(0x3C),
    CONNECTION_TERMINATIED_MIC_FAILURE(0x3D),
    CONN_FAILED_ESTABLISHMENT(0x3E),
    MAC_CONNECTION_FAILED(0x3F),
    COARSE_CLOCK_ADJUSTMENT_REJECTED(0x40),
    TYPE0_SUBMAP_NOT_DEFINED(0x41),
    UNKNOWN_ADVERTISING_IDENTIFIER(0x42),
    LIMIT_REACHED(0x43),
    OPERATION_CANCELLED_BY_HOST(0x44),
    PACKET_TOO_LONG(0x45);

    BluetoothHCIError(int value) {
        this.value = value;
    }

    private final int value;

    public int getValue() {
        return value;
    }

    public static BluetoothHCIError fromValue(int value) {
        for (BluetoothHCIError type : values()) {
            if (type.getValue() == value)
                return type;
        }
        return null;
    }
}

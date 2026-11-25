package com.shopflow.common.kafka;

public final class Topics {
    private Topics() {
    }
    
    public static final String ORDER_CREATED = "order.created";
    public static final String INVENTORY_RESERVED = "inventory.reserved";
    public static final String INVENTORY_FAILED = "inventory.failed";
    public static final String PAYMENT_COMPLETED = "payment.completed";
    public static final String PAYMENT_FAILED = "payment.failed";
    public static final String ORDER_CONFIRMED = "order.confirmed";
    public static final String ORDER_CANCELLED = "order.cancelled";
    public static final String USER_EVENTS = "user.events";

    public static final String RETRY_SUFFIX = ".retry";
    public static final String DLT_SUFFIX = ".dlt";
}

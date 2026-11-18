package com.shopflow.common.event;

import java.util.UUID;
import java.math.BigDecimal;
import java.time.Instant;

public record PaymentCompletedEvent(UUID eventId, UUID orderId, UUID userId, UUID paymentId, BigDecimal amount, Instant occuredAt) {
    public static PaymentCompletedEvent of(UUID orderId, UUID userId, UUID paymentId, BigDecimal amount) {
        return new PaymentCompletedEvent(UUID.randomUUID(), orderId, userId, paymentId, amount, Instant.now());
    }
}

package com.shopflow.common.event;

import java.util.UUID;
import java.time.Instant;

public record PaymentFailedEvent(UUID eventId, UUID orderId, UUID userId, String reason, Instant occurredAt) {
    public static PaymentFailedEvent of(UUID orderId, UUID userId, String reason) {
        return new PaymentFailedEvent(UUID.randomUUID(), orderId, userId, reason, Instant.now());
    }
}

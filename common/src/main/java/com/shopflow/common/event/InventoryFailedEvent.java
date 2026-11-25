package com.shopflow.common.event;

import java.util.UUID;
import java.time.Instant;

public record InventoryFailedEvent (UUID eventId, UUID orderId, UUID userId, String reason, Instant occurredAt) {
    public static InventoryFailedEvent of(UUID orderId, UUID userId, String reason) {
        return new InventoryFailedEvent(UUID.randomUUID(), orderId, userId, reason, Instant.now());
    }
}

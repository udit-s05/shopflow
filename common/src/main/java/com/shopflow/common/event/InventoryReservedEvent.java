package com.shopflow.common.event;

import java.util.UUID;
import java.math.BigDecimal;
import java.time.Instant;
public record InventoryReservedEvent(UUID eventId, UUID orderId, UUID userId, BigDecimal total, Instant occuredAt) {
    
    public static InventoryReservedEvent of(UUID orderId, UUID userId, BigDecimal total) {
        return new InventoryReservedEvent(UUID.randomUUID(), orderId, userId, total, Instant.now());
    }
}

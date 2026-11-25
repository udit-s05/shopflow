package com.shopflow.common.event;

import java.util.UUID;
import java.math.BigDecimal;
import java.util.List;
import java.time.Instant;

public record OrderCreatedEvent(UUID eventId, UUID orderId, UUID userId, BigDecimal total, Instant occurredAt, List<OrderItemDto> items) {
    
    public OrderCreatedEvent {
        items = List.copyOf(items);
    }

    public static OrderCreatedEvent of(UUID orderId, UUID userId, List<OrderItemDto> items, BigDecimal total) {
        return new OrderCreatedEvent(UUID.randomUUID(), orderId, userId, total, Instant.now(), items);
    }
}

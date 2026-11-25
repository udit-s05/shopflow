package com.shopflow.common.event;
import java.util.UUID;
import java.math.BigDecimal;

public record OrderItemDto(UUID productId, int quantity, BigDecimal unitPrice) {
    
}

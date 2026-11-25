package com.shopflow.common.event;

public record OtpRequestedEvent(String email, String otp, OtpPurpose purpose) {
    
}

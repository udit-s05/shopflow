package com.shopflow.common.web;
import java.time.Instant;
import java.util.Map;

public record ApiError(int status, String error, String message, String path, Instant timeStamp, Map<String, String> fieldErrors) {
    
    public ApiError {
        fieldErrors = fieldErrors == null ? Map.of() : Map.copyOf(fieldErrors);
    }

    public static ApiError of(int status, String error, String message, String path) {
        return new ApiError(status, error, message, path, Instant.now(), Map.of());
    }

    public static ApiError withFieldErrors(int status, String error, String message, String path, Map<String, String> fieldErrors) {
        return new ApiError(status, error, message, path, Instant.now(), fieldErrors);
    }
}

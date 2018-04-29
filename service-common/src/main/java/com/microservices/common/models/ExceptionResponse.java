package com.microservices.common.models;


import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * This class is instance to return when excpetion occurs in the applicaiton
 */
public class ExceptionResponse {
    private final String responseCode="0001";
    private LocalDateTime timestamp;
    private String errorCode;
    private String message;

    public ExceptionResponse( String errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
        this.timestamp=LocalDateTime.now();
    }

    public String getResponseCode() {
        return responseCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}

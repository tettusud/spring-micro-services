package com.microservices.common.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="No UserData found")
public class NotFoundException extends BaseException{

    private static final String CODE="002";

    public NotFoundException(String msg) {
        super(msg, CODE,HttpStatus.NOT_FOUND);
    }
}

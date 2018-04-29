package com.microservices.common.exception;

import org.springframework.http.HttpStatus;

public class BaseException extends RuntimeException {

    private String msg;
    private String code;
    private HttpStatus httpStatus ;

    public BaseException( String code, String msg) {
        super(msg);
        this.msg = msg;
        this.code = code;
    }

    public BaseException( String msg, String code,HttpStatus httpStatus) {
        this(code,msg);
        this.httpStatus = httpStatus;
    }

    public String getMsg() {
        return msg;
    }

    public String getCode() {
        return code;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}

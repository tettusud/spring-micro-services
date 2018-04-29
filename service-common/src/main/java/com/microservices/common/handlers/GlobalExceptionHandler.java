package com.microservices.common.handlers;


import com.microservices.common.exception.NotFoundException;
import com.microservices.common.models.ExceptionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/***
 * this class is used to handle all the exceptions
 */
@RestController
@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public final ResponseEntity<ExceptionResponse> handleUserNotFoundException(NotFoundException nfe) {
        return new ResponseEntity<>(new ExceptionResponse(nfe.getCode(),nfe.getMsg()), nfe.getHttpStatus());
    }
}

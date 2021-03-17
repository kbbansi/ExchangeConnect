package com.tlc.t11.ErrorHandlers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)

//BadRequest is the error handler for all bad requests
public class BadRequest extends RuntimeException{
    public BadRequest(String message) {
        super(message);
    }
}

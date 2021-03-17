package com.tlc.t11.ErrorHandlers;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)


//NotFound is the request handler for not found errors
public class NotFound extends RuntimeException{

    public NotFound(String message) {
        super(message);
    }
}

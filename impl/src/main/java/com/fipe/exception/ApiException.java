package com.fipe.exception;

import org.springframework.http.HttpStatus;

public abstract class ApiException extends RuntimeException {

    private static final long serialVersionUID = -6703826508169459858L;

    public ApiException() {
    }

    public ApiException(String message) {
        super(message);
    }

    public abstract Integer code();

    public abstract String message();

    public Object[] messageParams() {
        return null;
    }

    public abstract String detail();

    public Object[] detailParams() {
        return null;
    }

    public abstract String field();

    public abstract HttpStatus httpCode();
}

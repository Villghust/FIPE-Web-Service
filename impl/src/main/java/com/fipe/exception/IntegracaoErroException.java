package com.fipe.exception;

import org.springframework.http.HttpStatus;

public class IntegracaoErroException extends ApiException{

    private String message;

    public IntegracaoErroException(String message) {
        super(message);
    }

    public IntegracaoErroException() {
        super("Falha ao comunicar com servico");
    }

    @Override
    public Integer code() {
        return null;
    }

    @Override
    public String message() {
        return this.message;
    }

    @Override
    public String detail() {
        return null;
    }

    @Override
    public String field() {
        return null;
    }

    @Override
    public HttpStatus httpCode() {
        return HttpStatus.INTERNAL_SERVER_ERROR;
    }
}

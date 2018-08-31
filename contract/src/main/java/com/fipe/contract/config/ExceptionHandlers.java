package com.fipe.contract.config;

import com.fipe.exception.ApiExceptionModel;
import com.fipe.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.support.WebExchangeBindException;
import reactor.core.publisher.Flux;

import java.util.stream.Collectors;

@ControllerAdvice
public class ExceptionHandlers {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    @ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
    public Flux<ApiExceptionModel> handleException(Exception error) {
        return Flux.just(ApiExceptionModel.builder()
                .message(error.getMessage())
                .build());
    }

    @ExceptionHandler(WebExchangeBindException.class)
    @ResponseBody
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public Flux<ApiExceptionModel> webExchangeBind(WebExchangeBindException error) {
        return Flux.fromIterable(error.getAllErrors().stream().map(i -> ApiExceptionModel.builder()
                .message(i.getDefaultMessage())
                .field(((FieldError) i).getField())
                .build()).collect(Collectors.toList()));
    }

    @ExceptionHandler(NotFoundException.class)
    @ResponseBody
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public Flux<ApiExceptionModel> handleNotFoundException(NotFoundException error) {
        return Flux.just(ApiExceptionModel.builder()
                .message(error.message())
                .build());
    }
}

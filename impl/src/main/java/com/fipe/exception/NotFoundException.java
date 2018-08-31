package com.fipe.exception;

import org.springframework.http.HttpStatus;

public class NotFoundException extends ApiException {

  private static final long serialVersionUID = 7799300784870392538L;

  private String message;

  public NotFoundException(String message) {
    super(message);
    this.message = message;
  }

  public NotFoundException() {
    super("Nenhum dado Encontrado");
    this.message = "Nenhum dado Encontrado";
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
    return HttpStatus.NOT_FOUND;
  }
}
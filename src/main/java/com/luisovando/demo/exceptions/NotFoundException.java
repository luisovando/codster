package com.luisovando.demo.exceptions;

import org.springframework.http.HttpStatus;

public class NotFoundException extends GenericException {

  public NotFoundException(String message) {
    super("Medical Record Not Found!!!", message, HttpStatus.NOT_FOUND);
  }
}

package com.luisovando.demo.exceptions;

import org.springframework.http.HttpStatus;

public class ClientNotFoundException extends GenericException {

  public ClientNotFoundException(String message) {
    super("User not found", message, HttpStatus.NOT_FOUND);
  }
}

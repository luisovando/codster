package com.luisovando.demo.exceptions;

import com.luisovando.demo.domain.responses.ErrorResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomRestExceptionHandler extends ResponseEntityExceptionHandler {

  @ExceptionHandler({ClientNotFoundException.class})
  public ResponseEntity<Object> handleClientNotFound(final ClientNotFoundException ex,
      final WebRequest request) {
    final ErrorResponse error = new ErrorResponse(ex.getStatus(), ex.getMessage());
    return new ResponseEntity<>(error, new HttpHeaders(), error.getStatus());
  }

  @ExceptionHandler({NotFoundException.class})
  protected ResponseEntity<Object> handleNotFoundException(final NotFoundException ex,
      final WebRequest request) {
    final ErrorResponse response = new ErrorResponse(HttpStatus.NOT_FOUND, ex.getMessage());
    return new ResponseEntity<>(response, new HttpHeaders(), response.getStatus());
  }
}

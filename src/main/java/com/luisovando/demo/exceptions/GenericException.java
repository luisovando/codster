package com.luisovando.demo.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GenericException extends Exception {

  private static final long serialVersionUID = 7034951916481073044L;

  private String title;
  private String message;
  private HttpStatus status;

  public int getCodeStatus() {
    return this.status.value();
  }
}

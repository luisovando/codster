package com.luisovando.demo.domain.responses;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
@JsonPropertyOrder({"codigo", "mensaje"})
public class ErrorResponse {

  @JsonIgnore
  private HttpStatus status;
  @JsonProperty("mensaje")
  private String message;

  @JsonGetter("codigo")
  public int getStatusCode() {
    return status.value();
  }
}

package com.luisovando.demo.domain.responses;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.luisovando.demo.domain.models.MedicalRecord;
import lombok.Builder;
import org.springframework.http.HttpStatus;

@Builder
@JsonPropertyOrder({ "codigo", "mensaje", "payload" })
public class MedicalRecordResponse {
  @JsonIgnore
  public HttpStatus status;
  @JsonProperty("mensaje")
  public String statusMessage;
  public MedicalRecord payload;

  @JsonGetter("codigo")
  public int getStatusCode() {
    return status.value();
  }
}

package com.luisovando.demo.domain.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.luisovando.demo.domain.vo.Medicine;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Entity
@Getter
@Table(name = "allergies")
public class Allergy {
  @JsonIgnore
  public int allergyId;
  @JsonProperty("nombre")
  public String name;
  @JsonFormat(pattern="dd/MM/yy")
  @JsonProperty("fecha_alta")
  public Date createdAt;
  @JsonIgnore
  public Medicine medicine;

  @JsonGetter("medicamento")
  public String getMedicalTreatment() {
    return medicine.toString();
  }
}

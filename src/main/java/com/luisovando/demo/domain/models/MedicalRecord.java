package com.luisovando.demo.domain.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.HashSet;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Entity
@Getter
@Table(name = "medical_records")
public class MedicalRecord {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  @JsonProperty("no_expediente")
  public Integer medicalRecordId;
  @JsonFormat(pattern = "dd/MM/yy")
  @JsonProperty("fecha_ultima_consulta")
  public Date lastMedicalConsultation;
  @JsonProperty("tipo_sangre")
  public String bloodType;
  @JsonProperty("alergias")
  public HashSet<Allergy> allergies;
}

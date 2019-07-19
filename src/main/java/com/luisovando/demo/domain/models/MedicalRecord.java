package com.luisovando.demo.domain.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@Entity
@Getter
@NoArgsConstructor
@Table(name = "medical_records")
public class MedicalRecord {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @JsonIgnore
  private Integer id;
  @JsonProperty("no_expediente")
  public Integer medicalRecordId;
  @JsonFormat(pattern = "dd/MM/yy")
  @JsonProperty("fecha_ultima_consulta")
  public Date lastMedicalConsultation;
  @JsonProperty("tipo_sangre")
  public String bloodType;

  @OneToOne
  @JoinColumn(name = "account_id")
  @JsonIgnore
  private Account account;

  @ManyToMany(cascade = CascadeType.ALL)
  @JoinTable(name = "medical_record_allergy",
      joinColumns = @JoinColumn(name = "medical_record_id", referencedColumnName = "id"),
      inverseJoinColumns = @JoinColumn(name = "allergy_id", referencedColumnName = "id"))
  @JsonProperty("alergias")
  public Set<Allergy> allergies;
}

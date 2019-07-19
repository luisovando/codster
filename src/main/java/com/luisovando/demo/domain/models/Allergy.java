package com.luisovando.demo.domain.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "allergies")
public class Allergy {

  public Allergy(int allergyId, String name, Date createdAt,
      Medicine medicine) {
    this.id = allergyId;
    this.name = name;
    this.createdAt = createdAt;
    this.medicine = medicine;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @JsonIgnore
  public int id;
  @JsonProperty("nombre")
  public String name;
  @JsonFormat(pattern="dd/MM/yy")
  @JsonProperty("fecha_alta")
  public Date createdAt;

  @ManyToOne
  @JoinColumn(name="medicine_id")
  @JsonIgnore
  private Medicine medicine;

  @ManyToMany(mappedBy = "allergies")
  @JsonIgnore
  private List<MedicalRecord> records;

  @JsonGetter("medicamento")
  public String getMedicalTreatment() {
    return medicine.toString();
  }
}

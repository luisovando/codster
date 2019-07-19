package com.luisovando.demo.domain.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "medicines")
public class Medicine {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @JsonIgnore
  public int id;
  public String name;
  public String strength;

  @OneToMany(mappedBy = "medicine")
  private List<Allergy> allergyList;

  public Medicine(int id, String name, String strength) {
    this.id = id;
    this.name = name;
    this.strength = strength;
  }

  @Override
  public String toString() {
    return name + " " + strength;
  }
}

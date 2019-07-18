package com.luisovando.demo.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
public class Medicine {
  public String name;
  public String strength;

  @Override
  public String toString() {
    return name + " " + strength;
  }
}

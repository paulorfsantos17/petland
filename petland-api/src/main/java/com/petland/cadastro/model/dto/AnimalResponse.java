package com.petland.cadastro.model.dto;

import java.util.UUID;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class AnimalResponse extends AnimalRequest {
  private UUID id;

}

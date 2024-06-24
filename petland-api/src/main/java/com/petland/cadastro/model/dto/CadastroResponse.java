package com.petland.cadastro.model.dto;

import java.util.UUID;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)

public class CadastroResponse extends CadastroRequest {
  private UUID id;
}

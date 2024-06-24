package com.petland.cadastro.model.dto;

import java.util.UUID;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)

public class ProdutoServiceResponse extends ProdutoServiceRequest {
  private UUID id;
}

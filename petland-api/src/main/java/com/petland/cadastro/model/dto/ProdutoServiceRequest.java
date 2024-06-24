package com.petland.cadastro.model.dto;

import lombok.Data;

@Data
public class ProdutoServiceRequest {
  private String nome;
  private boolean servico;
  private Double valor;
}

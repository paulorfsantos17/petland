package com.petland.cadastro.model.entities;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Entity
@Table(name = "Prod_Service")
@Data
public class ProdutoServicoEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Setter(AccessLevel.NONE)
  private UUID id;
  @Column(length = 50, nullable = false)
  private String nome;

  private boolean servico;

  @Column(nullable = false)
  private Double valor;

}

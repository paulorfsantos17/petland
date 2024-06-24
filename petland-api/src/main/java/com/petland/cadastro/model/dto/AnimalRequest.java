package com.petland.cadastro.model.dto;

import java.util.Date;

import com.petland.cadastro.model.AnimalEspecie;

import lombok.Data;

@Data
public class AnimalRequest {

  private String nome;
  private Date aniversario;
  private AnimalEspecie especie;
}

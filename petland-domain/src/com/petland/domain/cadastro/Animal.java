package com.petland.domain.cadastro;

import java.util.Date;

public class Animal {
  private Integer id;
  private String nome;
  private Date aniversario;
  private Especie especie;
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public Date getAniversario() {
    return aniversario;
  }
  public void setAniversario(Date aniversario) {
    this.aniversario = aniversario;
  }
  public Especie getEspecie() {
    return especie;
  }
  public void setEspecie(Especie especie) {
    this.especie = especie;
  }
  

  
  
}

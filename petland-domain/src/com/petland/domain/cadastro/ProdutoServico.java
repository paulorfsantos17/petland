package com.petland.domain.cadastro;

public class ProdutoServico {
  private boolean servico;
  private Integer id;
  private String nome;
  private Double valor;

  public boolean isServico() {
    return servico;
  }

  public void setServico(boolean servico) {
    this.servico = servico;
  }

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

  public Double getValor() {
    return valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }
}

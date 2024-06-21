package com.petland.domain.atendimento;

import java.time.LocalTime;
import java.util.Date;

import com.petland.domain.cadastro.Animal;
import com.petland.domain.cadastro.Cadastro;
import com.petland.domain.cadastro.ProdutoServico;

public class Atendimento {
  private Integer id;
  private String description;
  private Date data;
  private LocalTime hora;
  private boolean emergencia;

  private Cadastro solictante;
  private ProdutoServico servico;
  private Animal paciente;
  private Double valor;

  public Double getValor() {
    return valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }

  private AtendimentoStatus status;
  private AtendimentoTipo tipo;

  public Integer getId() {
    return id;
  }

  public Cadastro getSolictante() {
    return solictante;
  }

  public void setSolictante(Cadastro solictante) {
    this.solictante = solictante;
  }

  public ProdutoServico getServico() {
    return servico;
  }

  public void setServico(ProdutoServico servico) {
    this.servico = servico;
  }

  public Animal getPaciente() {
    return paciente;
  }

  public void setPaciente(Animal paciente) {
    this.paciente = paciente;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Date getData() {
    return data;
  }

  public void setData(Date data) {
    this.data = data;
  }

  public LocalTime getHora() {
    return hora;
  }

  public void setHora(LocalTime hora) {
    this.hora = hora;
  }

  public boolean isEmergencia() {
    return emergencia;
  }

  public void setEmergencia(boolean emergencia) {
    this.emergencia = emergencia;
  }

  public AtendimentoStatus getStatus() {
    return status;
  }

  public void setStatus(AtendimentoStatus status) {
    this.status = status;
  }

  public AtendimentoTipo getTipo() {
    return tipo;
  }

  public void setTipo(AtendimentoTipo tipo) {
    this.tipo = tipo;
  }
}

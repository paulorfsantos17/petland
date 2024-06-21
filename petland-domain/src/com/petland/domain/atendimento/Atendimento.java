package com.petland.domain.atendimento;

import java.sql.Time;
import java.util.Date;

public class Atendimento {
  private Integer id;
  private String description;
  private Date data;
  private Time hora;
  private boolean emergencia;

  private AtendimentoStatus status;
  private AtendimentoTipo tipo;
  public Integer getId() {
    return id;
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
  public Time getHora() {
    return hora;
  }
  public void setHora(Time hora) {
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

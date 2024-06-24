package com.petland.cadastro.model.entities;

import java.util.Date;
import java.util.UUID;

import com.petland.cadastro.model.AnimalEspecie;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Entity
@Table(name = "tab_animal")
@Data
public class AnimalEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Setter(AccessLevel.NONE)
  private UUID id;
  @Column(length = 50, nullable = false)
  private String nome;

  private Date aniversario;

  @Enumerated(EnumType.STRING)
  private AnimalEspecie especie;

  @Column(name = "cad_tutor")
  private UUID cadastroId;

}

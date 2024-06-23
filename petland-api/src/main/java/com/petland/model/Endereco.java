package com.petland.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Endereco {
  @Column(name = "Logra", length = 50)
  private String lougadouro;

  @Column(name = "nr", length = 6)
  private String numero;

}

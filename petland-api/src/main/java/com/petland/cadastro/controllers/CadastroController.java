package com.petland.cadastro.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petland.cadastro.model.dto.CadastroRequest;
import com.petland.cadastro.model.dto.CadastroResponse;
import com.petland.cadastro.service.CadastroService;

@RestController
@RequestMapping("/cadastro")
public class CadastroController {

  @Autowired
  private CadastroService cadastroService;

  @GetMapping
  public List<CadastroResponse> listar() {
    return this.cadastroService.listar();
  }

  @PostMapping
  public UUID gravar(@RequestBody CadastroRequest request) {
    var result = this.cadastroService.gravar(request);

    return result;
  }

  @PutMapping("/{id}")
  public UUID alterar(@PathVariable String id, @RequestBody CadastroRequest request) {

    return this.cadastroService.alterar(id, request);

  }

  @DeleteMapping("/{id}")
  public String deletar(@PathVariable String id) {
    return this.cadastroService.deletar(id);
  }

}

package com.petland.cadastro.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.petland.cadastro.model.dto.ProdutoServiceRequest;
import com.petland.cadastro.model.dto.ProdutoServiceResponse;
import com.petland.cadastro.service.ServicoProdutoService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/produtos")
public class ProdutoServicoController {

  @Autowired
  private ServicoProdutoService produtoService;

  @GetMapping()
  public List<ProdutoServiceResponse> ListProdutos() {
    return this.produtoService.listar();
  }

  @PostMapping()
  public UUID gravar(@RequestBody ProdutoServiceRequest request) {
    return this.produtoService.gravar(request);

  }

  @PutMapping("/{id}")
  public UUID alterar(@PathVariable String id, @RequestBody ProdutoServiceRequest request) {
    return this.produtoService.alterar(id, request);
  }

  @DeleteMapping("/{id}")
  public String alterar(@PathVariable String id) {
    return this.produtoService.deletar(id);
  }

}

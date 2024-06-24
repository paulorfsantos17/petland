package com.petland.cadastro.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.petland.cadastro.model.dto.AnimalRequest;
import com.petland.cadastro.model.dto.AnimalResponse;
import com.petland.cadastro.service.AnimalService;

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

@RestController
@RequestMapping("/animais")
public class AnimalController {

  @Autowired
  private AnimalService animalService;

  @GetMapping
  public List<AnimalResponse> listar() {
    return this.animalService.listar();
  }

  @PostMapping
  public UUID gravar(@RequestBody AnimalRequest request) {
    var result = this.animalService.gravar(request);

    return result;
  }

  @PutMapping("/{id}")
  public UUID alterar(@PathVariable String id, @RequestBody AnimalRequest request) {

    return this.animalService.alterar(id, request);

  }

  @DeleteMapping("/{id}")
  public String deletar(@PathVariable String id) {
    return this.animalService.deletar(id);
  }

}

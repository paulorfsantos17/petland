package com.petland.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.petland.model.Animal;
import com.petland.repositories.AnimalRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class AnimalController {

  @Autowired
  private AnimalRepository animalRepository;

  @GetMapping("/animais")
  public List<Animal> ListAnimal() {
    return this.animalRepository.findAll();
  }

}

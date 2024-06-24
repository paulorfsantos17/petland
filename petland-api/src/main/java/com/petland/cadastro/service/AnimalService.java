package com.petland.cadastro.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petland.cadastro.model.dto.AnimalRequest;
import com.petland.cadastro.model.dto.AnimalResponse;
import com.petland.cadastro.model.entities.AnimalEntity;
import com.petland.cadastro.repositories.AnimalRepository;

@Service
public class AnimalService {
  @Autowired
  private AnimalRepository animalRepository;

  public UUID gravar(AnimalRequest animalRequest) {

    AnimalEntity entity = new AnimalEntity();
    BeanUtils.copyProperties(animalRequest, entity);

    this.animalRepository.save(entity);

    return entity.getId();
  }

  public UUID alterar(String id, AnimalRequest animalRequest) {

    AnimalEntity entity = this.animalRepository.findById(UUID.fromString(id)).orElse(null);

    if (entity != null) {
      BeanUtils.copyProperties(animalRequest, entity);
      this.animalRepository.save(entity);

      return entity.getId();
    }

    return null;

  }

  public String deletar(String id) {

    AnimalEntity entity = this.animalRepository.findById(UUID.fromString(id)).orElse(null);

    if (entity != null) {
      this.animalRepository.delete(entity);

      return "Animal excluido:" + id;
    }

    return null;

  }

  public List<AnimalResponse> listar() {
    List<AnimalEntity> animais = this.animalRepository.findAll();
    List<AnimalResponse> response = new ArrayList<AnimalResponse>();
    for (AnimalEntity animal : animais) {
      AnimalResponse res = new AnimalResponse();
      BeanUtils.copyProperties(animal, res);

      response.add(res);
    }
    return response;
  }

}

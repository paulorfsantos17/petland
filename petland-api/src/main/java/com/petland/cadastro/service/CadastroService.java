package com.petland.cadastro.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petland.cadastro.model.dto.CadastroResponse;
import com.petland.cadastro.model.entities.CadastroEntity;
import com.petland.cadastro.model.dto.CadastroRequest;
import com.petland.cadastro.repositories.CadastroRepository;

@Service
public class CadastroService {
  @Autowired
  private CadastroRepository cadastroRepository;

  public UUID gravar(CadastroRequest cadastroRequest) {

    CadastroEntity entity = new CadastroEntity();
    BeanUtils.copyProperties(cadastroRequest, entity);

    this.cadastroRepository.save(entity);

    return entity.getId();
  }

  public UUID alterar(String id, CadastroRequest cadastroRequest) {

    CadastroEntity entity = this.cadastroRepository.findById(UUID.fromString(id)).orElse(null);

    if (entity != null) {
      BeanUtils.copyProperties(cadastroRequest, entity);
      this.cadastroRepository.save(entity);

      return entity.getId();
    }

    return null;

  }

  public String deletar(String id) {

    CadastroEntity entity = this.cadastroRepository.findById(UUID.fromString(id)).orElse(null);

    if (entity != null) {
      this.cadastroRepository.delete(entity);

      return "Cadastro excluido:" + id;
    }

    return null;

  }

  public List<CadastroResponse> listar() {
    List<CadastroEntity> cadastros = this.cadastroRepository.findAll();
    List<CadastroResponse> response = new ArrayList<CadastroResponse>();
    for (CadastroEntity cadastro : cadastros) {
      CadastroResponse res = new CadastroResponse();
      BeanUtils.copyProperties(cadastro, res);

      response.add(res);
    }
    return response;
  }
}

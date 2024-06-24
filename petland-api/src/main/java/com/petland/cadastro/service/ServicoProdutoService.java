package com.petland.cadastro.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petland.cadastro.model.entities.ProdutoServicoEntity;
import com.petland.cadastro.repositories.ProdutoServicoRepository;
import com.petland.cadastro.model.dto.ProdutoServiceRequest;
import com.petland.cadastro.model.dto.ProdutoServiceResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ServicoProdutoService {
  @Autowired

  private ProdutoServicoRepository ProdutoServicoRepository;

  public UUID gravar(ProdutoServiceRequest ProdutoServicoRequest) {

    ProdutoServicoEntity entity = new ProdutoServicoEntity();
    BeanUtils.copyProperties(ProdutoServicoRequest, entity);

    this.ProdutoServicoRepository.save(entity);

    return entity.getId();
  }

  public UUID alterar(String id, ProdutoServiceRequest produtoServiceRequest) {

    ProdutoServicoEntity entity = this.ProdutoServicoRepository.findById(UUID.fromString(id)).orElse(null);

    if (entity != null) {
      BeanUtils.copyProperties(produtoServiceRequest, entity);
      this.ProdutoServicoRepository.save(entity);

      return entity.getId();
    }

    return null;

  }

  public String deletar(String id) {

    ProdutoServicoEntity entity = this.ProdutoServicoRepository.findById(UUID.fromString(id)).orElse(null);

    if (entity != null) {
      this.ProdutoServicoRepository.delete(entity);

      return "ProdutoServico excluido:" + id;
    }

    return null;

  }

  public List<ProdutoServiceResponse> listar() {
    List<ProdutoServicoEntity> ProdutoServicos = this.ProdutoServicoRepository.findAll();
    List<ProdutoServiceResponse> response = new ArrayList<ProdutoServiceResponse>();
    for (ProdutoServicoEntity ProdutoServico : ProdutoServicos) {
      ProdutoServiceResponse res = new ProdutoServiceResponse();
      BeanUtils.copyProperties(ProdutoServico, res);

      response.add(res);
    }
    return response;
  }
}

package com.petland.cadastro.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petland.cadastro.model.entities.ProdutoServicoEntity;

public interface ProdutoServicoRepository
    extends JpaRepository<ProdutoServicoEntity, UUID> {

}

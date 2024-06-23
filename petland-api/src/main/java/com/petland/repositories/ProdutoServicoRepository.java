package com.petland.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petland.model.ProdutoServico;

public interface ProdutoServicoRepository
                extends JpaRepository<ProdutoServico, UUID> {

}

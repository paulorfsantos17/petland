package com.petland.cadastro.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petland.cadastro.model.entities.CadastroEntity;

public interface CadastroRepository extends JpaRepository<CadastroEntity, UUID> {

}
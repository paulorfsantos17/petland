package com.petland.repositories;

import com.petland.model.Cadastro;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CadastroRepository extends JpaRepository<Cadastro, UUID> {

}
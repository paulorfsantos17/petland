package com.petland.cadastro.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petland.cadastro.model.entities.AnimalEntity;

/**
 * AnimalRepository
 */
public interface AnimalRepository extends JpaRepository<AnimalEntity, UUID> {

}
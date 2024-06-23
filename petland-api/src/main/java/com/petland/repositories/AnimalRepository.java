package com.petland.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petland.model.Animal;

/**
 * AnimalRepository
 */
public interface AnimalRepository extends JpaRepository<Animal, UUID> {

}
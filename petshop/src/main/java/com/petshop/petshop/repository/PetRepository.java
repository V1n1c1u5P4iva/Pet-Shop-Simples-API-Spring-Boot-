package com.petshop.petshop.repository;

import com.petshop.petshop.model.Pet;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {
} 

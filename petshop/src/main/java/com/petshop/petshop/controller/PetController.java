package com.petshop.petshop.controller;

import java.util.List;

import com.petshop.petshop.model.Pet;
import com.petshop.petshop.service.PetService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pets")
public class PetController {

    @Autowired
    private PetService petService;

    @GetMapping
    public List<Pet> getAllPets() {
        return petService.getAllPets();
    }

    @PostMapping
    public ResponseEntity<String> addPet(@RequestBody Pet pet) {
        petService.addPet(pet);
        return ResponseEntity.ok("Pet adicionado com sucesso!");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePetById(@PathVariable Long id) {
        boolean wasRemoved = petService.removePetById(id);
        if (wasRemoved) {
            return ResponseEntity.ok("Pet removido com sucesso!");
        }
        return ResponseEntity.status(404).body("Pet não encontrado!");
    }
}

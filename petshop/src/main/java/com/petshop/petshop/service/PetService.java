package com.petshop.petshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.petshop.petshop.model.Pet;
import com.petshop.petshop.repository.PetRepository;
import com.petshop.petshop.singleton.PetSingleton;;

@Service
public class PetService {
    @Autowired
    private PetRepository petRepository;

    private PetSingleton petSingleton = PetSingleton.getInstance();

    public List<Pet> getAllPets() {
        return petSingleton.getPets();
    }

    public void addPet(Pet pet) {
        petRepository.save(pet);
        petSingleton.addPet(pet);
    }

    public boolean removePetById(Long id) {
        if (petRepository.existsById(id)) {
            petRepository.deleteById(id);
            petSingleton.removePetById(id);
            return true;
        }
        return false;
    }

}

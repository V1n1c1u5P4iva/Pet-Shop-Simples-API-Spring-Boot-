package com.petshop.petshop.singleton;

import java.util.ArrayList;
import java.util.List;

import com.petshop.petshop.model.Pet;

public class PetSingleton {

    private static PetSingleton instance;
    private List<Pet> pets;

    public PetSingleton() {
        pets = new ArrayList<>();
    }

    public static PetSingleton getInstance() {

        if (instance == null) {
            instance = new PetSingleton();
        }

        return instance;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public void removePetById(Long id) {
        
        pets.removeIf(pet -> pet.getId().equals(id));
    }

}

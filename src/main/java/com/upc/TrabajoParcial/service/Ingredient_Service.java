package com.upc.TrabajoParcial.service;

import com.upc.TrabajoParcial.model.Ingredient;
import com.upc.TrabajoParcial.repository.Ingredient_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Ingredient_Service {
    @Autowired
    final private Ingredient_Repository ingredientRepository;

    public Ingredient_Service(Ingredient_Repository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    public List<Ingredient> Listar(){
        return ingredientRepository.findAll();
    }
    public Ingredient insertar(Ingredient ingredient){
        return ingredientRepository.save(ingredient);
    }

}

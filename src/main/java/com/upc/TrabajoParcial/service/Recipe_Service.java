package com.upc.TrabajoParcial.service;

import com.upc.TrabajoParcial.model.Recipe;
import com.upc.TrabajoParcial.repository.Recipe_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Recipe_Service {
    @Autowired
    final private Recipe_Repository recipeRepository;

    public Recipe_Service(Recipe_Repository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }
    public List<Recipe> Listar(){
        return recipeRepository.findAll();
    }
    public Recipe insertar( Recipe recipe){
        return recipeRepository.save(recipe);
    }
}

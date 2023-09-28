package com.upc.TrabajoParcial.service;

import com.upc.TrabajoParcial.model.Recipe_Ingredient;
import com.upc.TrabajoParcial.repository.Recipe_Ingredient_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Recipe_Ingredient_Service {
    @Autowired
    final private Recipe_Ingredient_Repository recipeIngredientRepository;

    public Recipe_Ingredient_Service(Recipe_Ingredient_Repository recipeIngredientRepository) {
        this.recipeIngredientRepository = recipeIngredientRepository;
    }

    public List<Recipe_Ingredient> Listar(){
        return recipeIngredientRepository.findAll();
    }
    public Recipe_Ingredient Insertar(Recipe_Ingredient recipeIngredient){
        return recipeIngredientRepository.save(recipeIngredient);
    }
}

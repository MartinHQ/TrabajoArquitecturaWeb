package com.upc.TrabajoParcial.controller;

import com.upc.TrabajoParcial.model.Recipe_Ingredient;
import com.upc.TrabajoParcial.service.Recipe_Ingredient_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/ListaIngredientes")
public class Recipe_Ingredient_Controller {
    @Autowired
    final private Recipe_Ingredient_Service recipeIngredientService;

    public Recipe_Ingredient_Controller(Recipe_Ingredient_Service recipeIngredientService) {
        this.recipeIngredientService = recipeIngredientService;
    }
    @GetMapping("/listar")
    public ResponseEntity<List<Recipe_Ingredient>> Listar(){
        return new ResponseEntity<>(recipeIngredientService.Listar(), HttpStatus.OK);
    }

    @PostMapping("/insertar")
    public ResponseEntity<Recipe_Ingredient> Insertar(@RequestBody Recipe_Ingredient recipeIngredient){
        return new ResponseEntity<>(recipeIngredientService.Insertar(recipeIngredient), HttpStatus.CREATED);
    }
}

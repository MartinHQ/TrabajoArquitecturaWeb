package com.upc.TrabajoParcial.controller;

import com.upc.TrabajoParcial.model.Recipe;
import com.upc.TrabajoParcial.service.Recipe_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/recipe")
public class Recipe_Controller {
    @Autowired
    final private Recipe_Service recipeService;

    public Recipe_Controller(Recipe_Service recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Recipe>> Listar(){
        return new ResponseEntity<>(recipeService.Listar(), HttpStatus.OK);
    }

    @PostMapping("/insertar")
    public ResponseEntity<Recipe> Insertar(@RequestBody Recipe recipe){
        return new ResponseEntity<>(recipeService.insertar(recipe),HttpStatus.CREATED);
    }
}

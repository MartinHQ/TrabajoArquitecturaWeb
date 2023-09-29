package com.upc.TrabajoParcial.controller;

import com.upc.TrabajoParcial.model.Ingredient;
import com.upc.TrabajoParcial.service.Ingredient_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/ingredient")
public class Ingredient_Controller {
    @Autowired
    final private Ingredient_Service ingredientService;

    public Ingredient_Controller(Ingredient_Service ingredientService) {
        this.ingredientService = ingredientService;
    }

    @GetMapping("/showList")
    public ResponseEntity<List<Ingredient>> Listar(){
        return new ResponseEntity<>(ingredientService.Show(), HttpStatus.OK);
    }

    @PostMapping("/insert")
    public ResponseEntity<Ingredient> Insertar(@RequestBody Ingredient ingredient){
        return new ResponseEntity<>(ingredientService.Insert(ingredient), HttpStatus.CREATED);
    }
}

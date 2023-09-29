package com.upc.TrabajoParcial.controller;

import com.upc.TrabajoParcial.model.Food_Label;
import com.upc.TrabajoParcial.service.Food_Label_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@RestController
@RequestMapping(path = "/foodLabel")
public class Food_Label_Controller {
    @Autowired
    final private Food_Label_Service foodLabelService;

    public Food_Label_Controller(Food_Label_Service foodLabelService) {
        this.foodLabelService = foodLabelService;
    }
    @GetMapping("/show")
    public ResponseEntity<List<Food_Label>> Listar(){
        return new ResponseEntity<>(foodLabelService.Listar(),HttpStatus.OK);
    }
    @PostMapping("/insert")
    public ResponseEntity<Food_Label> Insertar(@RequestBody Food_Label foodLabel ){
        return new ResponseEntity<>(foodLabelService.Insertar(foodLabel),HttpStatus.CREATED);
    }
}

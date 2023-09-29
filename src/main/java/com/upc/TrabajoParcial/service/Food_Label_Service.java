package com.upc.TrabajoParcial.service;

import com.upc.TrabajoParcial.model.Food_Label;
import com.upc.TrabajoParcial.repository.Food_Label_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Food_Label_Service {
    @Autowired
    final private Food_Label_Repository foodLabelRepository;

    public Food_Label_Service(Food_Label_Repository foodLabelRepository) {
        this.foodLabelRepository = foodLabelRepository;
    }

    public List<Food_Label> Listar(){
        return foodLabelRepository.findAll();
    }
    public Food_Label Insertar(Food_Label foodLabel){
        return foodLabelRepository.save(foodLabel);
    }
}

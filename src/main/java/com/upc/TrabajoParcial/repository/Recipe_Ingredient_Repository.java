package com.upc.TrabajoParcial.repository;

import com.upc.TrabajoParcial.model.Recipe_Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Recipe_Ingredient_Repository extends JpaRepository<Recipe_Ingredient,Long> {
}

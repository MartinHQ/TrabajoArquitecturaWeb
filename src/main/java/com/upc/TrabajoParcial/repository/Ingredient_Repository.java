package com.upc.TrabajoParcial.repository;

import com.upc.TrabajoParcial.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ingredient_Repository extends JpaRepository<Ingredient, Long> {
}

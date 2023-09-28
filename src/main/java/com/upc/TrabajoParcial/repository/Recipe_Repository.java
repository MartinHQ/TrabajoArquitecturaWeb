package com.upc.TrabajoParcial.repository;
import com.upc.TrabajoParcial.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Recipe_Repository extends JpaRepository<Recipe, Long> {
}

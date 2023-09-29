package com.upc.TrabajoParcial.repository;

import com.upc.TrabajoParcial.model.Food_Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Food_Label_Repository extends JpaRepository<Food_Label,Long> {
}

package com.upc.TrabajoParcial.repository;

import com.upc.TrabajoParcial.model.Recipe_Instruction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Recipe_Instruction_Repository extends JpaRepository<Recipe_Instruction,Long> {
}

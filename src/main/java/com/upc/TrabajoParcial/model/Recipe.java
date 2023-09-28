package com.upc.TrabajoParcial.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Rcp_id;

    private String Rcp_name;
    private String Rcp_description;
    private String Rcp_time_preparation;
    private String Rcp_image;

    private String Rcp_instruction;
}

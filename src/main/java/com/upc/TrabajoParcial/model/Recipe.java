package com.upc.TrabajoParcial.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Recipe_id")
    private Long Rcp_id;
    private String Rcp_name;
    private String Rcp_description;
    private String Rcp_time_preparation;
    private String Rcp_image;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_Step_id",referencedColumnName = "Recipe_id")
    private List<Recipe_Instruction> Rcp_instruction;

    @ManyToMany(mappedBy = "recipes")
    private List<User> User;
}

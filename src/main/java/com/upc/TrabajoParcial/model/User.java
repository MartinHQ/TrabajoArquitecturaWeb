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
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;


    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(name = "User_Recipe", joinColumns =
    @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "recipe_id",referencedColumnName = "Recipe_id"))
    private List<Recipe> recipes;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="Fk_foodLabel")
    private Food_Label foodLabel;
}

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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="Fk_foodLabel")
    private Food_Label foodLabel;

   /* @ManyToMany(fetch =FetchType.LAZY,mappedBy = "recipes")
    private List<User> User;*/

}

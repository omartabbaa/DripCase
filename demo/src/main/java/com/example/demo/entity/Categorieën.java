package com.example.demo.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "categorieen")
public class Categorieën {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private  String naam;
    private  String description;
    private  String image;
    @ManyToMany(mappedBy = "categorieen")
    private Set<Product> producten;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}

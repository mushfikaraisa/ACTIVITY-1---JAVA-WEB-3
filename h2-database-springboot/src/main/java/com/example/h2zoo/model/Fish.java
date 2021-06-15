package com.example.h2zoo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Fish {
    @Id
    @GeneratedValue
    private Long id;

    public Fish(String name, String species) {
        this.name = name;
        this.species = species;
    }

    private final String name;
    private final String species;
}

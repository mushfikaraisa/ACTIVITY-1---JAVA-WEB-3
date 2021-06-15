package com.example.h2zoo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Bird {
    @Id
    @GeneratedValue
    private Long id;
    private final String name;

    public Bird(String name, String species) {
        this.name = name;
        this.species = species;
    }

    private final String species;
}

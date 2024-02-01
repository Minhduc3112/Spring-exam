package com.vn.spring.login.models;

import jakarta.persistence.*;


@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // other fields

    // Constructors
    public Category() {
        // Default constructor
    }

    public Category(String name) {
        this.name = name;
        // Initialize other fields as needed
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Add getters and setters for other fields as needed
}


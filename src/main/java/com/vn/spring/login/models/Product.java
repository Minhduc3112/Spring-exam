package com.vn.spring.login.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // other fields

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    // Constructors
    public Product() {
        // Default constructor
    }

    public Product(String name, Category category) {
        this.name = name;
        this.category = category;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    // Add getters and setters for other fields as needed
}


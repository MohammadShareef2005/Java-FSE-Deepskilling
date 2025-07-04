package com.library.library_management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;

    // Constructors
    public Book() {
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getters & Setters
    // ...
}

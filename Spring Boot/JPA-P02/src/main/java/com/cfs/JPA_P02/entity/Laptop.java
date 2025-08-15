package com.cfs.JPA_P02.entity;

import jakarta.persistence.*;

@Entity
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String brand;
    private String title;

    @OneToOne
    @JoinColumn(name="student_id",unique = true)
    private Student student;

    public Laptop() {
    }

    public Laptop(String brand, String title) {
        this.brand = brand;
        this.title = title;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

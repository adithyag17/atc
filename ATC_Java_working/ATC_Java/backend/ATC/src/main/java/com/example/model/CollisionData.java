package com.example.model;
import jakarta.persistence.*;

@Entity
public class CollisionData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String model1;
    private String model2;

    // Default constructor (required for JPA)
    public CollisionData() {
    }

    // Constructor with parameters
    public CollisionData(String model1, String model2) {
        this.model1 = model1;
        this.model2 = model2;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel1() {
        return model1;
    }

    public void setModel1(String model1) {
        this.model1 = model1;
    }

    public String getModel2() {
        return model2;
    }

    public void setModel2(String model2) {
        this.model2 = model2;
    }
}

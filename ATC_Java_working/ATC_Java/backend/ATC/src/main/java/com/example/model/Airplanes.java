package com.example.model;
import jakarta.persistence.*;

@Entity
public class Airplanes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Changed from String to Long

    private String model;
    private String type;

    public Airplanes() {}

    public Airplanes(Long id,String model, String type) {
        this.id = id;
        this.model = model;
        this.type = type;
    }

    // Getters and setters
    public String getModel() {
        return model;
    }

    public Long getId() {
        return id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
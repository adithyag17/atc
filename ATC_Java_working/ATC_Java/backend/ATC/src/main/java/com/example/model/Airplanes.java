package com.example.model;

import jakarta.persistence.*;

@Entity
public class Airplanes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Changed from String to Long

    private String model;
    private String type;
    private Integer xcord; // New field for x coordinate
    private Integer ycord; // New field for y coordinate
    
    public Airplanes() {}

    public Airplanes(Long id, String model, String type, Integer xcord, Integer ycord) {
        this.id = id;
        this.model = model;
        this.type = type;
        this.xcord = xcord;
        this.ycord = ycord;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
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

    public Integer getXcord() {
        return xcord;
    }

    public void setXcord(Integer xcord) {
        this.xcord = xcord;
    }

    public Integer getYcord() {
        return ycord;
    }

    public void setYcord(Integer ycord) {
        this.ycord = ycord;
    }
}

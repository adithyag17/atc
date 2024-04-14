package com.example.model;

import java.time.LocalDateTime;
import jakarta.persistence.*;

@Entity
public class CollisionReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String model1;
    private String model2;
    private LocalDateTime time;
    private double xcord;
    private double ycord;

    // Constructor
    public CollisionReport(String model1, String model2, LocalDateTime time, double xcord, double ycord) {
        this.model1 = model1;
        this.model2 = model2;
        this.time = time;
        this.xcord = xcord;
        this.ycord = ycord;
    }

    // Getters and Setters
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

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public double getXcord() {
        return xcord;
    }

    public void setXcord(double xcord) {
        this.xcord = xcord;
    }

    public double getYcord() {
        return ycord;
    }

    public void setYcord(double ycord) {
        this.ycord = ycord;
    }
}
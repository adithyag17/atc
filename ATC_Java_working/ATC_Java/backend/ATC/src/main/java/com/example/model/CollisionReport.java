package com.example.model;

import jakarta.persistence.*;

@Entity
public class CollisionReport extends Report {

    @Column(nullable = false)
    private String model1;

    @Column(nullable = false)
    private String model2;

    @Column(nullable = false)
    private String timeOfCollision;

    public CollisionReport() {
    }

    public CollisionReport(String title, String content, String model1, String model2, String timeOfCollision) {
        super(title, content);
        this.model1 = model1;
        this.model2 = model2;
        this.timeOfCollision = timeOfCollision;
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

    public String getTimeOfCollision() {
        return timeOfCollision;
    }

    public void setTimeOfCollision(String timeOfCollision) {
        this.timeOfCollision = timeOfCollision;
    }
}

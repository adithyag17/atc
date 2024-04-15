package com.example.model;
import java.util.ArrayList;
import java.util.List;
import com.example.model.*;

public class ATC {
    private List<Airplanes> airplanesList;
    private List<CollisionReport> collisionReportsList;
    private List<Users> usersList;

    public ATC() {
        this.airplanesList = new ArrayList<>();
        this.collisionReportsList = new ArrayList<>();
        this.usersList = new ArrayList<>();
    }

    public void addAirplane(Airplanes airplane) {
        airplanesList.add(airplane);
    }

    public void addCollisionReport(CollisionReport report) {
        collisionReportsList.add(report);
    }

    public void addUser(Users user) {
        usersList.add(user);
    }

    // Add other methods as needed

    // Getters and setters
}

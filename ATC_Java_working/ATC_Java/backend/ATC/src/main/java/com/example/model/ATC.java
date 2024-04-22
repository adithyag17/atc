package com.example.model;
import java.util.ArrayList;
import java.util.List;
import com.example.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ATC {
    private List<Airplanes> airplanesList;
    private List<CollisionReport> collisionReportsList;
    private List<Users> usersList;
    @Autowired
    private UserRepository userRepository;

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
        user.setId((long)usersList.size() + 2);
        user.setRole("user");
        usersList.add(user);
        userRepository.save(user);
    }

    // Getters and setters
}

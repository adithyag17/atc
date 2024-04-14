package com.example;

import com.example.service.UserService;
import com.example.service.AirplaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.example.model")
public class Application implements CommandLineRunner {

    @Autowired
    private UserService userService;
    @Autowired
    private AirplaneService airplaneService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userService.printAllUsers();
        airplaneService.printAllAirplanes();
        System.out.println("kernel");

    }
}
package com.example.atc.service;

import com.example.atc.model.User;
import com.example.atc.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String authenticateUser(User user) {
        if (userRepository.isValidUser(user.getUsername(), user.getPassword(), user.getRole())) {
            return "User authenticated successfully!";
        } else {
            return "Invalid username, password, or role!";
        }
    }
}

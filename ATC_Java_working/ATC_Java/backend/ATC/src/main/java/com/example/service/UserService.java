package com.example.service;

import com.example.model.Users;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;


@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

    public Users authenticateUser(String username,String password,String role) {
        Optional<Users> optionalUser = userRepository.findByUsername(username);
        if (optionalUser.isPresent()) {
            Users user = optionalUser.get();
            if (user.getPassword().equals(password) && user.getRole().equals("admin")) {
                return user;
            }
        }
        throw new IllegalArgumentException("Invalid username or password");
    }

    public Users addUser(Users user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public void printAllUsers() {
        List<Users> users = getAllUsers();
        users.forEach(user -> System.out.println("User ID: " + user.getId() + ", Username: " + user.getUsername() + ", Role: " + user.getRole()));
    }
}
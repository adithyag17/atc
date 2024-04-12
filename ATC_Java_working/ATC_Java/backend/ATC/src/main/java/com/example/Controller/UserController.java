package com.example.Controller;

import com.example.model.Users;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    
    @GetMapping("/users")
    public String getUsers(Model model) {
        List<Users> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "users"; // return the users view
    }

    @PostMapping("/users")
    public String addUser(@ModelAttribute Users user) {
        userService.addUser(user);
        return "redirect:/users";
    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return "redirect:/users";
    }

    @PostMapping("/auth")
    public String authenticateUser(@ModelAttribute Users authRequest) {
        Users user = userService.authenticateUser(authRequest.getUsername(), authRequest.getPassword());
        if (user != null) {
            return "redirect:/users";
        } else {
            return "redirect:/login"; // redirect to the login view if authentication fails
        }
    }
}




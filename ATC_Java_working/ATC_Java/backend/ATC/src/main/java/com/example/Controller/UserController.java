package com.example.Controller;

import com.example.model.Users;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
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
    public String authenticateUser(Users user, Model model, RedirectAttributes redirectAttributes) {
        try {
            Users authenticatedUser = userService.authenticateUser(user.getUsername(), user.getPassword(),user.getPassword());
            UserDecorator userDecorator = new UserDecorator(authenticatedUser);
            redirectAttributes.addFlashAttribute("successMessage", userDecorator.getWelcomeMessage());
            return "redirect:/airplanes";
        } catch (IllegalArgumentException e) {
            model.addAttribute("successMessage", "");
            return "redirect:/users"; // Redirect back to login page on authentication failure
        }
    }
}

class UserDecorator extends Users {
    private Users user;

    public UserDecorator(Users user) {
        this.user = user;
    }

    public String getWelcomeMessage() {
        System.out.println("Welcome " + user.getUsername());
        return "Welcome " + user.getUsername();
    }
}
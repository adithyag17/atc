package com.example.Controller;
import com.example.model.ATC;
import com.example.model.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
@Controller
public class ATCController {

    private final ATC atc;

    @Autowired
    public ATCController(ATC atc) {
        this.atc = atc;
    }

    @GetMapping("/addUser")
    public String showAddUserForm(Model model) {
        model.addAttribute("user", new Users());
        return "addUser";
    }

    @PostMapping("/addUser")
    public String addUser(@ModelAttribute Users user, RedirectAttributes redirectAttributes) {
        // Assuming you have a method in ATC to add the user
        atc.addUser(user);
        // Optionally, save the user to the database here
        redirectAttributes.addFlashAttribute("message", "User added successfully!");
        return "redirect:/users"; // Redirect to a page showing all users
    }
}

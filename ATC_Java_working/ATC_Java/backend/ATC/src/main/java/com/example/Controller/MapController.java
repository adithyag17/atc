package com.Project.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    int lat1 = 25;
    int long1 = 75;
    int lat2 = 27;
    int long2 = 78;
    String flight1 = "Flight A";
    String flight2 = "Flight B";

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Hello World! Welcome to the Air Traffic Control System application");
        return "home";
    }

    @GetMapping("/map")
    public String map(Model model) {
        model.addAttribute("flight1",flight1);
        model.addAttribute("lat1", lat1);
        model.addAttribute("long1", long1);
        model.addAttribute("flight2",flight2);
        model.addAttribute("lat2", lat2);
        model.addAttribute("long2", long2);
        return "map"; 
    }
}
package com.example.Controller;

import com.example.model.Airplanes;
import com.example.service.AirplaneService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HelloController {

    private final AirplaneService airplaneService;

    public HelloController(AirplaneService airplaneService) {
        this.airplaneService = airplaneService;
    }

    @GetMapping("/map")
    public String map(Model model) {
        List<Airplanes> airplanes = airplaneService.getAllAirplanes();
        model.addAttribute("airplanes", airplanes);
        return "map";
    }
}

package com.example.Controller;
import com.example.service.UserService;
import com.example.service.AirplaneService;
import com.example.model.Airplanes;
import com.example.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
public class AirplaneController {

    private final AirplaneService airplaneService;
    private final UserService authenticationService;

    @Autowired
    public AirplaneController(AirplaneService airplaneService, UserService authenticationService) {
        this.airplaneService = airplaneService;
        this.authenticationService = authenticationService;
    }

    @GetMapping("/airplanes")
    public String getAllAirplanes(Model model) {
        List<Airplanes> airplanes = airplaneService.getAllAirplanes();
        model.addAttribute("airplanes", airplanes);
        return "airplanes"; // return a view that displays all airplanes
    }

}
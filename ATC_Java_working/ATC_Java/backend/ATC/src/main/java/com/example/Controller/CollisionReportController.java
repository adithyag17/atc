package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CollisionReportController {

    @GetMapping("/collisionreport")
    public String showCollisionReport() {
        return "collisionreport";
    }
}
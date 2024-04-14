package com.example.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.model.CollisionReport;
import com.example.service.CollisionReportService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class CollisionController {
    public final CollisionReportService collisionReportService;

    @Autowired
    public CollisionController(CollisionReportService collisionReportService) {
        this.collisionReportService = collisionReportService;
    }

    @PostMapping("/collision-catcher")
    public String handleCollisionRequest(@RequestBody CollisionReport collisionReport) {
        String model1 = collisionReport.getModel1();
        String model2 = collisionReport.getModel2();
        System.out.println("Collision detected between " + model1 + " and " + model2);
        System.out.println(collisionReport);
        //collisionReportService.saveCollisionReport(collisionReport);
        return "Collision handled successfully";
    }
}
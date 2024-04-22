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
        CollisionReportDecorator decoratedReport = new CollisionReportDecorator(collisionReport);
        String collisionMessage = decoratedReport.displayCollisionMessage(collisionReport.getModel1(), collisionReport.getModel2());
        System.out.println(collisionMessage);
        //collisionReportService.saveCollisionReport(collisionReport);
        return "Collision handled successfully";
    }
}
class CollisionReportDecorator extends CollisionReport {
    private CollisionReport collisionReport;

    public CollisionReportDecorator(CollisionReport collisionReport) {
        this.collisionReport = collisionReport;
    }
    public String displayCollisionMessage(String model1, String model2) {
        System.out.println("Collision detected between " + model1 + " and " + model2                                                                               + " at 10:00 AM");
        return "Collision detected between " + model1 + " and " + model2 + " at 10:00 AM";
    }
}
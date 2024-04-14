
package com.example.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.model.CollisionReport;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CollisionController {
    @PostMapping("/collision-catcher")
    public String handleCollisionRequest(@RequestBody CollisionReport CollisionReport) {
        String model1 = CollisionReport.getModel1();
        String model2 = CollisionReport.getModel2();
        System.out.println("Collision detected between " + model1 + " and " + model2);
        return "Collision handled successfully";
    }
}

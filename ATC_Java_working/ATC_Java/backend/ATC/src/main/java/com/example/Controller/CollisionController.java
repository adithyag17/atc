
package com.example.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.model.CollisionData;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.CollisionData;
@RestController
public class CollisionController {
    @PostMapping("/collision-catcher")
    public String handleCollisionRequest(@RequestBody CollisionData collisionData) {
        String model1 = collisionData.getModel1();
        String model2 = collisionData.getModel2();
        System.out.println("Collision detected between " + model1 + " and " + model2);
        return "Collision handled successfully";
    }
}

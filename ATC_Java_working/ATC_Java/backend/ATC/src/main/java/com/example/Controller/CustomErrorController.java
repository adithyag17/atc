package com.example.Controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError() {
        // Handle errors gracefully here
        // You can return a custom error page or redirect to a specific endpoint
        return "error"; // Assuming you have an error.html template
    }

   
}


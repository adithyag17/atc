package com.example.Controller;

import com.example.model.CollisionReport;
import com.example.service.CollisionReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CollisionReportController {

    private final CollisionReportService collisionReportService;

    @Autowired
    public CollisionReportController(CollisionReportService collisionReportService) {
        this.collisionReportService = collisionReportService;
    }

    @GetMapping("/collisionreport")
    public String showCollisionReport() {
        return "collisionreport";
    }
    @PostMapping("/collision-reports")
    public String addCollisionReport(@ModelAttribute CollisionReport collisionReport) {
        collisionReportService.saveCollisionReport(collisionReport);
        return "collision-reports";
    }
    @GetMapping("/collision-reports")
        public String showCollisionReports(Model model) {
        List<CollisionReport> collisionReports = collisionReportService.getAllCollisionReports();
        model.addAttribute("collisionReports", collisionReports);
        return "collisionreport";
    }

    @DeleteMapping("/collision-reports/{id}")
    public String deleteCollisionReport(@PathVariable Long id) {
        collisionReportService.deleteCollisionReport(id);
        return "redirect:/collision-reports";
    }
}

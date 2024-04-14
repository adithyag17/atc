package com.example.service;

import com.example.model.CollisionReport;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class CollisionReportService {

    // This is a placeholder list of collision reports.
    // In a real application, you would fetch this data from a database or another data source.
    private List<CollisionReport> collisionReports = new ArrayList<>();

    public CollisionReportService() {
        // Example data
        collisionReports.add(new CollisionReport("ModelA", "ModelB", LocalDateTime.now(), 12.34, 56.78));
        collisionReports.add(new CollisionReport("ModelC", "ModelD", LocalDateTime.now(), 90.12, 34.56));
    }

    public List<CollisionReport> getCollisionReports() {
        return collisionReports;
    }
}
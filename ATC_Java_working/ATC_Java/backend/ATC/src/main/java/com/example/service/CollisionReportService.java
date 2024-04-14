package com.example.service;

import com.example.model.CollisionReport;

import java.util.List;

public interface CollisionReportService {
    CollisionReport saveCollisionReport(CollisionReport collisionReport);
    List<CollisionReport> getAllCollisionReports();
    CollisionReport getCollisionReportById(Long id);
    void deleteCollisionReport(Long id);
}

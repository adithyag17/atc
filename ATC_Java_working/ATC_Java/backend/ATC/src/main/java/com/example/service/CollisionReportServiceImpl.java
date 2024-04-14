package com.example.service;

import com.example.model.CollisionReport;
import com.example.repository.CollisionReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CollisionReportServiceImpl implements CollisionReportService {

    private final CollisionReportRepository collisionReportRepository;

    @Autowired
    public CollisionReportServiceImpl(CollisionReportRepository collisionReportRepository) {
        this.collisionReportRepository = collisionReportRepository;
    }

    @Override
    public CollisionReport saveCollisionReport(CollisionReport collisionReport) {
        return collisionReportRepository.save(collisionReport);
    }

    @Override
    public List<CollisionReport> getAllCollisionReports() {
        return collisionReportRepository.findAll();
    }

    @Override
    public CollisionReport getCollisionReportById(Long id) {
        Optional<CollisionReport> optionalCollisionReport = collisionReportRepository.findById(id);
        return optionalCollisionReport.orElse(null);
    }

    @Override
    public void deleteCollisionReport(Long id) {
        collisionReportRepository.deleteById(id);
    }
}

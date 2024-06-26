package com.example.repository;

import com.example.model.CollisionReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollisionReportRepository extends JpaRepository<CollisionReport, Long> {
    // No need to add any method here as JpaRepository provides basic CRUD operations
}

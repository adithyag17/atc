package com.example.repository;

import com.example.model.Airplanes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface AirplaneRepository extends JpaRepository<Airplanes, Long> {
    List<Airplanes> findByModel(String model);
}

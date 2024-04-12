package com.example.service;

import com.example.model.Airplanes;
import com.example.repository.AirplaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirplaneService {

    private final AirplaneRepository airplaneRepository;

    @Autowired
    public AirplaneService(AirplaneRepository airplaneRepository) {
        this.airplaneRepository = airplaneRepository;
    }

    public List<Airplanes> getAllAirplanes() {
        return airplaneRepository.findAll();
    }

    public Airplanes addAirplane(Airplanes airplane) {
        return airplaneRepository.save(airplane);
    }

    public void deleteAirplane(Long id) {
        airplaneRepository.deleteById(id);
    }

    public void printAllAirplanes() {
        List<Airplanes> airplanes = getAllAirplanes();
        airplanes.forEach(airplane -> System.out.println("Airplane ID: " + airplane.getId() + ", Model: " + airplane.getModel() + ", Type: " + airplane.getType()));
    }
}
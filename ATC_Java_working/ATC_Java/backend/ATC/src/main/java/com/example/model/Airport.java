package com.example.model;
import java.util.HashMap;
import java.util.Map;
import com.example.model.*;

public class Airport {
    private String code;
    private Map<String, Airplanes> airplanes;

    public Airport(String code) {
        this.code = code;
        this.airplanes = new HashMap<>();
    }

    public void acceptAirplane(Airplanes airplane) {
        airplanes.put(airplane.getModel(), airplane);
    }


    // Other methods as needed

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Map<String, Airplanes> getAirplanes() {
        return airplanes;
    }
    public void releaseAirplane(String modeltype) {
        airplanes.remove(modeltype);
    }

    public void setAirplanes(Map<String, Airplanes> airplanes) {
        this.airplanes = airplanes;
    }
}

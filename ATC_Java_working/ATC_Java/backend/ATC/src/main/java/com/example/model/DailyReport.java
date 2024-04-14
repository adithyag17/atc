package com.example.model;
import com.example.model.Airplanes;
import com.example.model.Report;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class DailyReport extends Report {

    @ManyToMany
    private List<Airplanes> airplanesList;

    public DailyReport() {
    }

    public DailyReport(String title, String content, List<Airplanes> airplanesList) {
        super(title, content);
        this.airplanesList = airplanesList;
    }

    public List<Airplanes> getAirplanesList() {
        return airplanesList;
    }

    public void setAirplanesList(List<Airplanes> airplanesList) {
        this.airplanesList = airplanesList;
    }
}

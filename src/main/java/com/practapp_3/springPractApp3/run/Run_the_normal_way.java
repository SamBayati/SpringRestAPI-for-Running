package com.practapp_3.springPractApp3.run;

import javax.xml.stream.Location;
import java.time.LocalDate;

public class Run_the_normal_way {

    private Integer id;
    private String title;
    private LocalDate startedOn;
    private LocalDate completedOn;
    private Integer miles;
    private Location location;

    // the constructor for the values:
    public Run_the_normal_way(Integer id, String title, LocalDate startedOn, LocalDate completedOn, Integer miles, Location location){
        this.id = id;
        this.title = title;
        this.startedOn = startedOn;
        this.completedOn = completedOn;
        this.miles = miles;
        this.location = location;
    }

    // Getters and Setters for the values :
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getStartedOn() {
        return startedOn;
    }

    public void setStartedOn(LocalDate startedOn) {
        this.startedOn = startedOn;
    }

    public LocalDate getCompletedOn() {
        return completedOn;
    }

    public void setCompletedOn(LocalDate completedOn) {
        this.completedOn = completedOn;
    }

    public Integer getMiles() {
        return miles;
    }

    public void setMiles(Integer miles) {
        this.miles = miles;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}


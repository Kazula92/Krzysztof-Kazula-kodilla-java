package com.kodilla.good.patterns.flights;

import java.util.Set;

public class FlightSet {

    private Set<Flight> flightSet;
    private String info;

    public FlightSet(Set<Flight> flightSet, String info) {
        this.flightSet = flightSet;
        this.info = info;
    }

    public Set<Flight> getFlightSet() {
        return flightSet;
    }

    public String getInfo() {
        return info;
    }
}

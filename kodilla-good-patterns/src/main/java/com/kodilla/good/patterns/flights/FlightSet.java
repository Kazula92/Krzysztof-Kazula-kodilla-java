package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightSet {

    private final Set<Flight> flightSet = new HashSet<>();

    public Set<Flight> flightSet() {
        flightSet.add(new Flight("Katowice", "Gdansk"));
        flightSet.add(new Flight("Lodz", "Londyn"));
        flightSet.add(new Flight("Krakow", "Poznan"));
        flightSet.add(new Flight("Rzeszow", "Poznan"));

        return flightSet;
    }
}

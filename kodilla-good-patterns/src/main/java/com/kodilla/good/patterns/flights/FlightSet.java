package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightSet {

    private final Set<Flight> flightSet = new HashSet<>();

    public boolean addFlight (Flight flight) {
        flightSet.add(flight);
        return true;
    }

    public Set<Flight> getFlightSet() {
        return flightSet;
    }

}

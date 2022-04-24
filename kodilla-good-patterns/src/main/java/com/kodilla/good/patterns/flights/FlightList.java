package com.kodilla.good.patterns.flights;

import java.util.*;

public class FlightList {

    private final Set<Flight> flightSet;

    public FlightList() {

        flightSet= new HashSet<>();

        Flight katowice= new Flight("Katowice");
        Flight gdansk= new Flight("Gdansk");
        Flight warszawa= new Flight("Warszawa");
        Flight krakow= new Flight("Krakow");
        Flight szczecin= new Flight("Szczecin");
        Flight rzeszow= new Flight("Rzeszow");

        katowice.addArrival(gdansk);
        katowice.addArrival(warszawa);
        katowice.addArrival(krakow);

        gdansk.addArrival(warszawa);
        gdansk.addArrival(krakow);
        gdansk.addArrival(szczecin);

        warszawa.addArrival(krakow);
        warszawa.addArrival(szczecin);
        warszawa.addArrival(rzeszow);

        krakow.addArrival(szczecin);
        krakow.addArrival(rzeszow);
        krakow.addArrival(katowice);

        szczecin.addArrival(rzeszow);
        szczecin.addArrival(katowice);
        szczecin.addArrival(gdansk);

        rzeszow.addArrival(katowice);
        rzeszow.addArrival(gdansk);
        rzeszow.addArrival(warszawa);

        flightSet.add(katowice);
        flightSet.add(gdansk);
        flightSet.add(warszawa);
        flightSet.add(krakow);
        flightSet.add(szczecin);
        flightSet.add(rzeszow);
    }

    public Set<Flight> getFlightSet() {
        return flightSet;
    }
}

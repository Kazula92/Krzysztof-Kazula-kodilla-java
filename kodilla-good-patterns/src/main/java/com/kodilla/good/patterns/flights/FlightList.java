package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FlightList {

    private final List<Flight> flightList = new ArrayList<>();
    private final HashMap<Flight, String> flightList2 = new HashMap<>();

    public List<Flight> flightList0 () {
        flightList.add(new Flight("Katowice", "Gdansk"));
        flightList.add(new Flight("Katowice", "Szczecin"));
        flightList.add(new Flight("Katowice", "Warszawa"));
        flightList.add(new Flight("Krakow", "Gdansk"));
        flightList.add(new Flight("Rzeszow", "Szczecin"));

        return flightList;
    }

    public HashMap<Flight, String> flightList3 () {

        flightList2.put(new Flight("Katowice", "Gdansk"), "Warszawa");
        flightList2.put(new Flight("Katowice", "Szczecin"), "Poznan");
        flightList2.put(new Flight("Krakow", "Gdansk"), "Poznan");
        flightList2.put(new Flight("Rzeszow", "Szczecin"), "Warszawa");

        return flightList2;
    }
}

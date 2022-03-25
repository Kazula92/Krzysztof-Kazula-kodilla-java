package com.kodilla.good.patterns.flights;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FlightsMap {

    public static Map<Integer, Flight> getFlightsMap() {

        Map<Integer, Flight> flightsMap = new HashMap<>();
        flightsMap.put(1, new Flight("Katowice", Optional.of("Warszawa"), "Gdanska"));
        flightsMap.put(2, new Flight("Lodz", Optional.of("Berlin"), "Londyn"));
        flightsMap.put(3,new Flight("Krakow",Optional.empty(), "Poznan"));
        flightsMap.put(4, new Flight("Rzeszow", Optional.of("Warszawa"), "Poznan"));

        return flightsMap;
    }
}

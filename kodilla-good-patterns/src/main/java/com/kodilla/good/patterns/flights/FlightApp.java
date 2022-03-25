package com.kodilla.good.patterns.flights;

import java.util.Map;
import java.util.Optional;

import static com.kodilla.good.patterns.flights.FlightsMap.getFlightsMap;

public class FlightApp {

    public static void main(String[] args) {

        String departureCity = "Lodz";
        Optional<String> intermediateCity = Optional.of("Berlin");
        String arrivalCity = "Londyn";

        Flight flight = new Flight(departureCity,intermediateCity, arrivalCity);
        FlightSearch flightSearch = new FlightSearch();

        Map<Integer,Flight> flightsMap = getFlightsMap();

        flightSearch.searchFlightFromCity(departureCity, flightsMap);
        flightSearch.searchFlightToCity(arrivalCity,flightsMap);
        flightSearch.searchFlightIntermediateCity(flight,flightsMap);
    }
}

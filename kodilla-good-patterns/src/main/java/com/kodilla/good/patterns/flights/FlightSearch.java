package com.kodilla.good.patterns.flights;

import java.util.Map;

public final class FlightSearch {

    public void searchFlightFromCity(String departureCity, Map<Integer,Flight> flightsMap) {
        System.out.println("\nDeparture from: " + departureCity);
        flightsMap.entrySet().stream()
                .filter(entry -> entry.getValue().getDepartureCity().equals(departureCity))
                .forEach(System.out::println);
    }

    public void searchFlightToCity(String arrivalCity, Map<Integer,Flight> flightsMap) {
        System.out.println("\nArrival to: " + arrivalCity);
        flightsMap.entrySet().stream()
                .filter(entry -> entry.getValue().getArrivalCity().equals(arrivalCity))
                .forEach(System.out::println);
    }
    public void searchFlightIntermediateCity(Flight flight, Map<Integer, Flight> flightsMap) {
        System.out.println("\nDeparture from: " + flight.getDepartureCity() + " through " + flight.getIntermediateCity()
                + " to " + flight.getArrivalCity());
        flightsMap.entrySet().stream()
                .filter(entry -> entry.getValue().equals(flight))
                .forEach(System.out::println);
    }
}

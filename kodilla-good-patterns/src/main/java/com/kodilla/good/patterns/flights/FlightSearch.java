package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public final class FlightSearch {

    private final Set<Flight> listFlight;

    public FlightSearch(Set<Flight> listFlight) {
        this.listFlight = listFlight;
    }


    public void searchFlightFromCity(String departureCity) {
        System.out.println("\nDeparture from: " + departureCity);
        listFlight.stream()
                .filter(s -> s.getDepartureCity().equals(departureCity))
                .map(s->s.toString())
                .forEach(System.out::println);
        System.out.println();
    }

    public void searchFlightToCity(String arrivalCity) {
        System.out.println("\nArrival to: " + arrivalCity);
        listFlight.stream()
                .filter(s -> s.getArrivalCity().equals(arrivalCity))
                .map(s->s.toString())
                .forEach(System.out::println);
        System.out.println();
    }

    public void findConnectingFlight (String departureCity, String transferInTheCity, String arrivalCity) {

        System.out.println("\nDeparture from: " + departureCity + " to " + arrivalCity
                + " with a change in: " + transferInTheCity);
        List<Flight> connectingFlights = listFlight.stream()
                .filter(s->s.getDepartureCity().equals(departureCity) && s.getArrivalCity().equals(transferInTheCity))
                .collect(Collectors.toList());
        listFlight.stream()
                .filter(s->s.getDepartureCity().equals(transferInTheCity) && s.getArrivalCity().equals(arrivalCity))
                .collect(Collectors.toCollection(()->connectingFlights));
        connectingFlights.stream()
                .forEach(System.out::println);
    }
}

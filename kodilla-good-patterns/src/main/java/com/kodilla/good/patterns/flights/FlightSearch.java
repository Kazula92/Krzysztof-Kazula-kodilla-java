package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public final class FlightSearch {

    FlightList searchFlightFromCity = new FlightList();
    FlightList searchFlightToCity = new FlightList();
    FlightList findConnectingFlight = new FlightList();


    public void searchFlightFromCity(String departureCity) {
        System.out.println("\nDeparture from: " + departureCity);
        searchFlightFromCity.flightList0().stream()
                .filter(s -> Objects.equals(s.getDepartureCity(), departureCity))
                .forEach(System.out::println);
    }

    public void searchFlightToCity(String arrivalCity) {
        System.out.println("\nArrival to: " + arrivalCity);
        searchFlightToCity.flightList0().stream()
                .filter(s -> Objects.equals(s.getArrivalCity(), arrivalCity))
                .forEach(System.out::println);
    }

    public void findConnectingFlight (String transferInTheCity) {

        findConnectingFlight.flightList3().entrySet()
                .stream().filter(t -> Objects.equals(t.getValue(), transferInTheCity))
                .map(entry -> "\nDeparture from " + entry.getKey().getDepartureCity()
                        + " to " + entry.getKey().getArrivalCity() + " by " + transferInTheCity + " exist.")
                .forEach(System.out::println);
    }
}
package com.kodilla.good.patterns.flights;

import java.util.Set;

public final class FlightSearch {

    private final FlightSet set = new FlightSet();
    private final Set<Flight> flightSet = set.flightSet();
    private final Set<Flight> flightSet1 = set.flightSet();
    private final Set<Flight> flightSet2 = set.flightSet();
    private final Set<Flight> flightSet3 = set.flightSet();


    public void searchFlightFromCity(String airportCity) {
        System.out.println("\nDeparture from: " + airportCity);
        flightSet.stream()
                .filter(s -> s.getDepartureCity().equals(airportCity))
                .forEach(System.out::println);
    }

    public void searchFlightToCity(String airportCity) {
        System.out.println("\nArrival to: " + airportCity);
        flightSet.stream()
                .filter(s -> s.getArrivalCity().equals(airportCity))
                .forEach(System.out::println);
    }

    public void findConnectingFlight (String airportCity1, String airportCity2, String airportCity3) {

        System.out.println("\nConnecting flights in: " + airportCity1);

        flightSet1.stream()
                .filter(s -> s.getDepartureCity().equals(airportCity1))
                .filter(s ->s.getArrivalCity().equals(airportCity2))
                .forEach(System.out::println);

        flightSet2.stream()
                .filter(s -> s.getDepartureCity().equals(airportCity2))
                .filter(s ->s.getArrivalCity().equals(airportCity3))
                .forEach(System.out::println);

    }
}

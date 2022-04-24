package com.kodilla.good.patterns.flights;

import java.util.Set;
import java.util.stream.Collectors;

public final class FlightSearch {

    public FlightSet searchFlightFromCity(Flight departureCity, Set<Flight> flightSet) {
        Set<Flight> result = flightSet.stream()
                .filter(flight -> flight.equals(departureCity))
                .flatMap(flight -> flight.getArrivalCity().stream())
                .collect(Collectors.toSet());
        String info= "\nDeparture from: " + departureCity;
        return new FlightSet(result, info);
    }

    public FlightSet searchFlightToCity(Flight arrivalCity, Set<Flight> flightSet) {
        Set<Flight> result = flightSet.stream()
                .filter(flight -> {
                    if (flight.getArrivalCity().contains(arrivalCity)) {
                        return true;
                    } else return false;
                })
                .collect(Collectors.toSet());
        String info="\nArrival to: " + arrivalCity;
        return new FlightSet(result, info);
    }

    public FlightSet findConnectingFlight (Flight departureCity, Flight arrivalCity, Set<Flight> flightSet) {
        Set<Flight> result = searchFlightToCity(arrivalCity, searchFlightFromCity(departureCity, flightSet).getFlightSet()).getFlightSet();
        String info="\nDeparture from " + departureCity + " to " + arrivalCity + " through cities ";
        return new FlightSet(result, info);
    }
}
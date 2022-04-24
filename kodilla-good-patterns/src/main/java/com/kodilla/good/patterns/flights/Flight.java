package com.kodilla.good.patterns.flights;


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public final class Flight {

    private final String departureCity;
    private final Set<Flight> arrivalCity= new HashSet<>();

    public Flight(String departureCity) {
        this.departureCity = departureCity;
    }

    public void addArrival(Flight flight) {
        arrivalCity.add(flight);
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public Set<Flight> getArrivalCity() {
        return arrivalCity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        return getDepartureCity().equals(flight.getDepartureCity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDepartureCity());
    }

    @Override
    public String toString() {
        return departureCity;
    }
}
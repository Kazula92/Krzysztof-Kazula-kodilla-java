package com.kodilla.good.patterns.flights;


public final class Flight {

    private final String departureCity;
    private final String arrivalCity;

    public Flight(String departureCity, String arrivalCity) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!departureCity.equals(flight.departureCity)) return false;
        return arrivalCity.equals(flight.arrivalCity);
    }

    @Override
    public int hashCode() {
        int result = departureCity.hashCode();
        result = 31 * result + arrivalCity.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departureCity='" + departureCity + '\'' +
                ", arrivalCity='" + arrivalCity + '\'' +
                '}';
    }
}

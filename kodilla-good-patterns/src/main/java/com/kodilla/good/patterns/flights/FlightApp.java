package com.kodilla.good.patterns.flights;

public class FlightApp {

    public static void main(String[] args) {

        FlightSearch flightSearch = new FlightSearch();
        flightSearch.searchFlightFromCity("Katowice");
        flightSearch.searchFlightToCity("Gdansk");
        flightSearch.findConnectingFlight("Poznan");
    }
}
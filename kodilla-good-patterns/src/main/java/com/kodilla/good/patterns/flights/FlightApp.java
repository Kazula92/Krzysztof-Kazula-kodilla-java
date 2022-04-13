package com.kodilla.good.patterns.flights;

public class FlightApp {

    public static void main(String[] args) {

        FlightSet flightSet = FlightList.retrieve();

        FlightSearch flightSearch = new FlightSearch(flightSet.getFlightSet());
        flightSearch.searchFlightFromCity("Katowice");
        flightSearch.searchFlightToCity("Gdansk");
        flightSearch.findConnectingFlight("Katowice", "Lodz", "Gdansk");
    }
}
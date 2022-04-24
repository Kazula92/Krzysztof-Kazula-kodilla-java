package com.kodilla.good.patterns.flights;

import java.util.Set;

public class FlightApp {

    public static void main(String[] args) {

        FlightSearch flightSearch = new FlightSearch();
        FlightList flightList= new FlightList();
        Set<Flight> flights = flightList.getFlightSet();
        Flight flightFrom = new Flight("Katowice");
        Flight flightTo = new Flight("Rzeszow");
        Information info= new Information();

        FlightSet flightSet= flightSearch.searchFlightToCity(flightTo, flights);
        info.information(flightSet.getInfo(), flightSet.getFlightSet());
        flightSet= flightSearch.searchFlightFromCity(flightFrom, flights);
        info.information(flightSet.getInfo(), flightSet.getFlightSet());
        flightSet= flightSearch.findConnectingFlight(flightFrom, flightTo, flights);
        info.information(flightSet.getInfo(), flightSet.getFlightSet());
    }
}
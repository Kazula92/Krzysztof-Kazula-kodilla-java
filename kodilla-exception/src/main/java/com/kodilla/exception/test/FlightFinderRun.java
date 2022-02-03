package com.kodilla.exception.test;

public class FlightFinderRun {

    public static void main(String[] args) {

        Flight flight = new Flight("airport No.3 ", "airport No.9 " );
        FlightFinder flightFinder = new FlightFinder();
        try {
            flightFinder.findFilght(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("There is no such airport.");
        }
    }
}

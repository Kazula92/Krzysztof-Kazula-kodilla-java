package com.kodilla.good.patterns.flights;

public class FlightList {

    public static FlightSet retrieve() {

        Flight flight1 = new Flight("Katowice", "Gdansk");
        Flight flight2 = new Flight("Lodz", "Londyn");
        Flight flight3 = new Flight("Krakow", "Poznan");
        Flight flight4 = new Flight("Rzeszow", "Poznan");

        FlightSet flightS = new FlightSet();

        flightS.addFlight(flight1);
        flightS.addFlight(flight2);
        flightS.addFlight(flight3);
        flightS.addFlight(flight4);

        return flightS;
    }


}

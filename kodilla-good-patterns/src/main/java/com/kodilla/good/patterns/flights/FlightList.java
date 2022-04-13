package com.kodilla.good.patterns.flights;

public class FlightList {

    public static FlightSet retrieve() {

        Flight flight1 = new Flight("Katowice", "Gdansk");
        Flight flight1a = new Flight("Katowice", "Lodz");
        Flight flight1b = new Flight("Lodz", "Gdansk");
        Flight flight2 = new Flight("Lodz", "Londyn");
        Flight flight3 = new Flight("Krakow", "Poznan");
        Flight flight4 = new Flight("Rzeszow", "Poznan");
        Flight flight5 = new Flight("Rzeszow", "Krakow");
        Flight flight6 = new Flight("Krakow", "Poznan");

        FlightSet flightS = new FlightSet();

        flightS.addFlight(flight1);
        flightS.addFlight(flight1a);
        flightS.addFlight(flight1b);
        flightS.addFlight(flight2);
        flightS.addFlight(flight3);
        flightS.addFlight(flight4);
        flightS.addFlight(flight5);
        flightS.addFlight(flight6);

        return flightS;
    }


}

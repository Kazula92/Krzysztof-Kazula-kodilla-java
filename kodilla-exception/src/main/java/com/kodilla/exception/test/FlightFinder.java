package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFilght(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> theMap = new HashMap<String, Boolean>();
        theMap.put("airport No.1 ", false);
        theMap.put("airport No.2 ", false);
        theMap.put("airport No.3 ", true);
        theMap.put("airport No.4 ", false);
        theMap.put("airport No.5 ", true);

        if ((!theMap.containsKey(flight.getArrivalAirport()))) {
            throw new RouteNotFoundException();
        } else {
            if ((theMap.get(flight.getArrivalAirport()))) {
                System.out.println("Departure from: " + flight.getDepartureAirport() + "to " + flight.getArrivalAirport() + "is possible");
            } else {
                System.out.println("Departure from: " + flight.getDepartureAirport() + "to " + flight.getArrivalAirport() + "is not possible");
            }
        }
    }
}

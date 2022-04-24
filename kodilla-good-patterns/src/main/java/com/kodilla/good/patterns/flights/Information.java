package com.kodilla.good.patterns.flights;

import java.util.Set;

public class Information {

    public void information (String info, Set<Flight> flightSet) {
        System.out.println("------------------");
        System.out.println(info);
        flightSet.stream().forEach(System.out::println);
        System.out.println("------------------");
    }
}

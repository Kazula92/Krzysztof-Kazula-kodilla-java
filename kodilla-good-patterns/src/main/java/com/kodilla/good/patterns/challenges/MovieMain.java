package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieMain {

    private static final String SEPARATOR = "! ";

    public static void main(String[] args) {

        Map<String, List<String>> listMap = new MovieStore().getMovies();

        String result = listMap.values()
                .stream()
                .flatMap(s -> s.stream())
                .collect(Collectors.joining(SEPARATOR));

        System.out.println(result);
    }
}

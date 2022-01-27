package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        //list of countries
        Country country1 = new Country("Chiny", new BigDecimal("1411778724"));
        Country country2 = new Country("India", new BigDecimal("1359527236"));
        Country country3 = new Country("USA", new BigDecimal("332403650"));
        Country country4 = new Country("Russia", new BigDecimal("146238185"));
        Country country5 = new Country("Japan", new BigDecimal("125396901"));
        Country country6 = new Country("Mexico", new BigDecimal("126014024"));
        Country country7 = new Country("Germany", new BigDecimal("83019200"));

        //list of continents
        Continent continent1 = new Continent("Asia");
        Continent continent2 = new Continent("America");
        Continent continent3 = new Continent("Europe");

        //world

        World world = new World();

        world.addContinents(continent1);
        world.addContinents(continent2);
        world.addContinents(continent3);

        continent1.addContinentCountry(country1);
        continent1.addContinentCountry(country2);
        continent1.addContinentCountry(country4);
        continent1.addContinentCountry(country5);

        continent2.addContinentCountry(country3);
        continent2.addContinentCountry(country6);

        continent3.addContinentCountry(country4);
        continent3.addContinentCountry(country7);

        List<Continent> continents = new ArrayList<>();
        continents.add(continent1);
        continents.add(continent2);
        continents.add(continent3);

        //When
        BigDecimal totalPeopleQuantity = continents.stream()
                .flatMap(people-> people.getContinentsCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        }
}

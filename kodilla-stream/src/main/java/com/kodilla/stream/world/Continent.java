package com.kodilla.stream.world;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class Continent {

    private final String continentName;
    private final Set<Country> continentsCountries = new HashSet<>();

    public Continent(final String continentName) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }

    public Set<Country> getContinentsCountries() {
        return continentsCountries;
    }

    public void addContinentCountry(Country country) {
        continentsCountries.add(country);
    }

    @Override
    public String toString() {
        return "Continent{" +
                "continentName='" + continentName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return continentName.equals(continent.continentName);
    }

    @Override
    public int hashCode() {
        return continentName.hashCode();
    }

}


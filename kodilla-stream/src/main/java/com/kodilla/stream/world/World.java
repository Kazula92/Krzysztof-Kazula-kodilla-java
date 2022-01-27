package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public final class World {

    private final Set<Continent> worldsContinents = new HashSet<>();

    public Set<Continent> getWorldsContinents() {
        return worldsContinents;
    }

    public void addContinents (Continent continent) {
        worldsContinents.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        return worldsContinents.stream()
                .flatMap(word-> word.getContinentsCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

    }
}

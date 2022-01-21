package com.kodilla.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;

public class TemperaturesStub implements Temperatures {

    @Override
    public Map<String,Double> getTemperatures(){
        Map<String,Double> stubResult = new HashMap<>();

        stubResult.put("Rzeszow", 25.5);
        stubResult.put("Krakow", 26.4);
        stubResult.put("Wroclaw", 24.8);
        stubResult.put("Warszawa", 25.1);
        stubResult.put("Gdańsk", 23.5);

        return stubResult;
    }

}

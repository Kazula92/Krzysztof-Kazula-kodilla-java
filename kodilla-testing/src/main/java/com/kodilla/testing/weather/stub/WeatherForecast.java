package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double averageTemperatures(){

        int sumTemp = 0;
        int averageTemp = 0;

        for(Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()){
            sumTemp += temperature.getValue();
        }
        averageTemp = sumTemp / temperatures.getTemperatures().size();
        return averageTemp;
    }

    public double medianTemperatures(){
        List<Double> tempList = new ArrayList<>();
        double medianTemp = 0;
        for(Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()){
        tempList.add(temperature.getValue());
        }
        Collections.sort(tempList);
        if (tempList.size() % 2==0){
            medianTemp= tempList.get((tempList.size()/2)) + tempList.get(((tempList.size()/2)-1));
        }else{
            medianTemp= tempList.get((tempList.size()/2));
        }
        return medianTemp;
    }

}


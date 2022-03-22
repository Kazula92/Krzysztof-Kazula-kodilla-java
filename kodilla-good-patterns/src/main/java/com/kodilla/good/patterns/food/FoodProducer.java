package com.kodilla.good.patterns.food;

public class FoodProducer implements Producer {

    String producerName;

    public FoodProducer(String producerName) {
        this.producerName = producerName;
    }

    public String getProducerName() {
        return producerName;
    }

    public boolean process(){
        System.out.println("An order made for the producer: " + getProducerName());
        return true;
    }
}

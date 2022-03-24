package com.kodilla.good.patterns.food2door;

public class HealthyShop implements Producer{

    @Override
    public boolean process(OrderServiceInfo orderServiceInfo) {
        System.out.println("Welcome to HealthyShop! ");
        return true;
    }
}

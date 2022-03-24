package com.kodilla.good.patterns.food2door;

public class GlutenFreeShop implements Producer{

    @Override
    public boolean process(OrderServiceInfo orderServiceInfo) {
        System.out.println("Welcome to GlutenFreeShop!");
        return true;
    }
}

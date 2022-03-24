package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop implements Producer {

    @Override
    public boolean process(OrderServiceInfo orderServiceInfo) {
        System.out.println("Welcome to ExtraFoodShop! ");
        return true;
    }
}

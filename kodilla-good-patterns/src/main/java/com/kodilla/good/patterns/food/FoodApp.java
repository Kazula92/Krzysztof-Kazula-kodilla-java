package com.kodilla.good.patterns.food;

public class FoodApp {

    public static void main(String[] args) {

        FoodOrderRequestRetriever foodOrderRequestRetriever = new FoodOrderRequestRetriever();
        FoodOrderService foodOrderService = foodOrderRequestRetriever.retrieve();

        OrderServiceInformation orderServiceInformation = new OrderServiceInformation();
        orderServiceInformation.Order(foodOrderService);
    }
}

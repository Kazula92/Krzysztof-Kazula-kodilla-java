package com.kodilla.good.patterns.food;

public class FoodOrderRequestRetriever {

    public FoodOrderService retrieve() {

        FoodProducer foodProducer = new FoodProducer("GlutenFreeShop");
        String foodQuantity = "8 pieces";
        String foodType = "Pasta with sauce";

        return new FoodOrderService(foodProducer, foodQuantity, foodType);
    }
}

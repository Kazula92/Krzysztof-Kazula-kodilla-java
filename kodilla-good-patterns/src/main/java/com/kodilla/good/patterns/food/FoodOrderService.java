package com.kodilla.good.patterns.food;

public class FoodOrderService {

    private FoodProducer foodProducer;
    private String foodQuantity;
    private String foodType;

    public FoodOrderService(final FoodProducer foodProducer, final String foodQuantity, final String foodType) {
        this.foodProducer = foodProducer;
        this.foodQuantity = foodQuantity;
        this.foodType = foodType;
    }

    public FoodProducer getFoodProducer() {
        return foodProducer;
    }

    public String getFoodQuantity() {
        return foodQuantity;
    }

    public String getFoodType() {
        return foodType;
    }
}

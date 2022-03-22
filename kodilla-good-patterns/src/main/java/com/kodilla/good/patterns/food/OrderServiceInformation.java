package com.kodilla.good.patterns.food;

public class OrderServiceInformation {

    public void Order(FoodOrderService foodOrderService) {
        if (foodOrderService.getFoodProducer().process()) {
            System.out.println("Number of completed orders: " + foodOrderService.getFoodQuantity());
            System.out.println("Order type: " + foodOrderService.getFoodType());
        } else {
            System.out.println("The order has not been placed");
        }

    }
}

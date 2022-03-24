package com.kodilla.good.patterns.food2door;

public class FoodApp {

    public static void main(String args []) {

        Product productA = new Product("Pasta with sauce");
        Product productB = new Product("Pizza");
        Product productC = new Product("Burger");
        Product productD = new Product("Pancakes");

        OrderServiceInfo orderServiceInfo1 = new OrderServiceInfo(productA,2);
        OrderServiceInfo orderServiceInfo2 = new OrderServiceInfo(productB,1);
        OrderServiceInfo orderServiceInfo3 = new OrderServiceInfo(productC,4);
        OrderServiceInfo orderServiceInfo4 = new OrderServiceInfo(productD,7);

        FoodOrderService foodOrderService = new FoodOrderService();

        foodOrderService.foodOrder(new ExtraFoodShop(),orderServiceInfo1);
        foodOrderService.foodOrder(new HealthyShop(),orderServiceInfo4);
        foodOrderService.foodOrder(new GlutenFreeShop(),orderServiceInfo3);
    }
}

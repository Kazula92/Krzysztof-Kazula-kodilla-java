package com.kodilla.good.patterns.food2door;

public class FoodOrderService {

    public void foodOrder(Producer producer, OrderServiceInfo orderServiceInfo) {
        boolean order = producer.process(orderServiceInfo);
        if(order) {
            System.out.println("Your order has been placed");
        } else {
            System.out.println("Order error!!!");
        }
    }
}

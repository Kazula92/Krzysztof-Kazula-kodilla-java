package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ExecutedOrderRepository implements OrderRepository {

    @Override
    public boolean createOrder(User user, LocalDateTime orderDate) {
        System.out.println("User " + user.getUserName() + " placed an order... order registered correctly: "
                            + orderDate);
        return true;
    }
}

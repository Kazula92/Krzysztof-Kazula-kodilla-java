package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class PremiumOrderService implements OrderService {

    public boolean order(User user, LocalDateTime time) {
        System.out.println("Fulfillment of the order for the user: " + user.getUserName() + "(" + user.getFirstName()
                            + " " + user.getLastName() + ")");
        return time.isBefore(LocalDateTime.now());
    }
}

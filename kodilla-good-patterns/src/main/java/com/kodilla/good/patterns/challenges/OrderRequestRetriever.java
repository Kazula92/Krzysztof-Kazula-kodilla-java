package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("Dron", "Adam", "Nowak", "dron123@wp.pl");
        LocalDateTime orderDate = LocalDateTime.of(2019, 10, 12, 10, 15);

        return new OrderRequest(user, orderDate);
    }
}

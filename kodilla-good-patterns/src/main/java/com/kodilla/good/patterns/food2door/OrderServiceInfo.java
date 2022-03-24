package com.kodilla.good.patterns.food2door;

public class OrderServiceInfo {

    private Product product;
    private int quantity;

    public OrderServiceInfo(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}

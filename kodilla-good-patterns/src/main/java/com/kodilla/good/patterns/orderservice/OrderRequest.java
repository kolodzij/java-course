package com.kodilla.good.patterns.orderservice;

import java.util.ArrayList;

public class OrderRequest {
    public User user;
    public long orderId;
    public ArrayList<Product> orderedProducts;

    public OrderRequest(User user, long orderId, ArrayList<Product> orderedProducts) {
        this.user = user;
        this.orderId = orderId;
        this.orderedProducts = orderedProducts;
    }

    public User getUser() {
        return user;
    }

    public long getOrderId() {
        return orderId;
    }

    public ArrayList<Product> getOrderedProducts() {
        return orderedProducts;
    }
}

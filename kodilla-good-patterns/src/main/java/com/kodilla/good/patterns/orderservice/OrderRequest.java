package com.kodilla.good.patterns.orderservice;

import java.util.ArrayList;

public class OrderRequest {
    public User user;
    public long orderID;
    public ArrayList<Product> orderedProducts;

    public OrderRequest(User user, long orderID, ArrayList<Product> orderedProducts) {
        this.user = user;
        this.orderID = orderID;
        this.orderedProducts = orderedProducts;
    }

    public User getUser() {
        return user;
    }

    public long getOrderID() {
        return orderID;
    }

    public ArrayList<Product> getOrderedProducts() {
        return orderedProducts;
    }
}

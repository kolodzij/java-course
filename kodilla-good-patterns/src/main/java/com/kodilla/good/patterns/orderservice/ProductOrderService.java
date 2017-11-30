package com.kodilla.good.patterns.orderservice;

public class ProductOrderService implements OrderService {

    public boolean order(User user, long orderID) {
        System.out.println("Making an order " + orderID);
        return true;
    }
}

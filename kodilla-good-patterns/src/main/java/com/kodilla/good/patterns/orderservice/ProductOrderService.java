package com.kodilla.good.patterns.orderservice;

public class ProductOrderService implements OrderService {

    public boolean order(User user, long orderId) {
        System.out.println("Making an order " + orderId);
        return true;
    }
}

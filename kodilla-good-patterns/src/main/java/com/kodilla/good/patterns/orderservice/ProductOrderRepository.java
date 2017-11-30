package com.kodilla.good.patterns.orderservice;

public class ProductOrderRepository implements OrderRepository {

    public void createOrder(User user, long orderID) {
        System.out.println("Order has been added to repository");
    }
}

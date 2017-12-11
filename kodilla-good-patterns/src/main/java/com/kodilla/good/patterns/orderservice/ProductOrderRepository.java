package com.kodilla.good.patterns.orderservice;

public class ProductOrderRepository implements OrderRepository {

    public void createOrder(User user, long orderId) {
        System.out.println("Supplier has been added to repository");
    }
}

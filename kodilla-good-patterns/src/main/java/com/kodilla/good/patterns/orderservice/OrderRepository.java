package com.kodilla.good.patterns.orderservice;

public interface OrderRepository {

    void createOrder(User user, long orderID);
}

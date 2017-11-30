package com.kodilla.good.patterns.orderservice;

public class OrderDto {

    User user;
    long  orderId;

    public OrderDto(User user, long orderId) {
        this.user = user;
        this.orderId = orderId;
    }
}

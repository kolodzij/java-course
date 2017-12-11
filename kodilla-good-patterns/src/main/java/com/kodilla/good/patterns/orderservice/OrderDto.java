package com.kodilla.good.patterns.orderservice;

public class OrderDto {

    private User user;
    private long  orderId;


    public OrderDto(User user, long orderId) {
        this.user = user;
        this.orderId = orderId;
    }

    public User getUser() {
        return user;
    }

    public long getOrderId() {
        return orderId;
    }
}

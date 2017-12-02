package com.kodilla.good.patterns.food2door;

public class OrderInfo {

    public void inform(OrderRequest orderRequest) {
        System.out.println("Zamówienie " + orderRequest.getProduct().getName() + " zostało zrealizowane");
    }

}

package com.kodilla.good.patterns.orderservice;

import java.util.ArrayList;

public class Application {

    public static void main (String[] args) {

        OrderInfoRetriever orderInfoRetriever = new OrderInfoRetriever();
        OrderRequest orderRequest = orderInfoRetriever.retrive();
        OrderProcessor orderProcessor = new OrderProcessor(new MailServices(),new ProductOrderService(), new ProductOrderRepository());
        orderProcessor.process(orderRequest);
    }
}

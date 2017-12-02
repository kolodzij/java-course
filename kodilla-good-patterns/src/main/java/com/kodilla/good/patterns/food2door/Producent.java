package com.kodilla.good.patterns.food2door;

public interface Producent {
    void process(OrderRequest order);
    boolean canMakeOrder(OrderRequest orderRequest);
    String getName();
    long getProducentID();

}

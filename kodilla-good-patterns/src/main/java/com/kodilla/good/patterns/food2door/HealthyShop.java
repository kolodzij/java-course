package com.kodilla.good.patterns.food2door;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements Producent {
    String name;
    long producentID;
    HashMap<String, Integer> stock;

    public HealthyShop() {
        this.name = "HealthyShop";
        this.producentID = 3581;
        this.stock = new HashMap<String, Integer>();

        stock.put("2341",15);
        stock.put("9874",120);
        stock.put("1141",50);
        stock.put("8913",2);
    }

    public boolean canMakeOrder(OrderRequest orderRequest) {
        if (stock.containsKey(orderRequest.getProduct().getProductCode()) && (stock.get(orderRequest.getProduct().getProductCode()) >= orderRequest.getQuantity())) {
            return true;
        }
        return false;
    }

    public void process(OrderRequest orderRequest) {
        stock.replace(orderRequest.getProduct().getProductCode(),stock.get(orderRequest.getProduct().getProductCode()) - orderRequest.getQuantity());
        System.out.println("Zamówienie w trakcie realizacji");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public long getProducentID() {
        return producentID;
    }

}

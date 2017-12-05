package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;

public class GlutenFreeShop implements Producent {
    private String name= "GlutenFreeShop";
    private long producentID=3572;
    private ArrayList<String> productsList;

    public GlutenFreeShop() {
        productsList = new ArrayList<String>();
        productsList.add("konfitura z dzikiej róży");
        productsList.add("słonecznik łuskany");
        productsList.add("jaja wiejskie");
    }

    public boolean canMakeOrder(OrderRequest orderRequest) {
         return productsList.contains(orderRequest.getProduct().getName());
    }

    public void process(OrderRequest order) {
        System.out.println("Zamówienie gotowe do odbioru.");

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public long getProducentId() {
        return producentID;
    }
}

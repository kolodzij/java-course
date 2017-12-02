package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;

public class GlutenFreeShop implements Producent {
    String name;
    long producentID;
    ArrayList<String> productsList;

    public GlutenFreeShop() {
        this.name = "GlutenFreeShop";
        this.producentID = 35181;
        this.productsList = new ArrayList<String>();

        productsList.add("konfitura z dzikiej róży");
        productsList.add("słonecznik łuskany");
        productsList.add("jaja wiejskie");
    }

    public boolean canMakeOrder(OrderRequest orderRequest) {
        if (productsList.contains(orderRequest.getProduct().getName())) {
            return true;
        }
        return false;
    }

    public void process(OrderRequest order) {
        System.out.println("Zamówienie gotowe do odbioru.");

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

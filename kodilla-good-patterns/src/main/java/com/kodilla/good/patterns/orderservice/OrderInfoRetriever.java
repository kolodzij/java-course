package com.kodilla.good.patterns.orderservice;

import java.util.ArrayList;

public class OrderInfoRetriever {

    public OrderRequest retrive() {
        User user = new User("Jan","Kowalski","j.kowalski@blabla");
        ArrayList<Product> productsList = new ArrayList<>();
        productsList.add(new Product("aaa","128956484"));
        productsList.add(new Product("bbb","315465452"));
        productsList.add(new Product("ccc","899453213"));

        return new OrderRequest(user, 5547, productsList);
    }
}

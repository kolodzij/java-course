package com.kodilla.good.patterns.orderservice;

import java.util.ArrayList;

public class OrderInfoRetriever {

    public OrderRequest retrive() {
        User user = new User("Jan","Kowalski","j.kowalski@blabla");
        ArrayList<Product> productsList = new ArrayList<>();
        Product p1= new Product("aaa","128956484");
        Product p2= new Product("bbb","315465452");
        Product p3= new Product("ccc","899453213");
        Product p4= new Product("ddd","523897458");

        return new OrderRequest(user, 5547, productsList);

    }
}

package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;

public class Application {
    public static void main (String[] args) {

        Product p1 = new Product("jaja wiejskie", "2341", 15);
        Product p2 = new Product("konfitura z dzikiej róży", "8913", 25);
        Product p3 = new Product("miód rzepakowy", "a4341", 45);
        Product p4 = new Product("sok z marchwi", "1141", 15);
        Product p5 = new Product("słonecznik łuskany", "5141", 15);

        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.producentRegister(new HealthyShop());
        orderProcessor.producentRegister(new GlutenFreeShop());
        orderProcessor.producentRegister(new ExtraFoodShop());

        orderProcessor.orderProcess(new OrderRequest(p1, 15));
        orderProcessor.orderProcess(new OrderRequest(p2, 20));
        orderProcessor.orderProcess(new OrderRequest(p3, 100));
        orderProcessor.orderProcess(new OrderRequest(p4, 12));
        orderProcessor.orderProcess(new OrderRequest(p5, 15));
        orderProcessor.orderProcess(new OrderRequest(p1, 10));
    }
}

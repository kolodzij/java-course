package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;

public class OrderProcessor {

    ArrayList<Producent> producentsList;

    public OrderProcessor() {
        producentsList = new ArrayList<Producent>();
    }

    public void producentRegister(Producent producent){
        producentsList.add(producent);
    }

    private Producent findProducent(OrderRequest orderRequest){
        for (Producent p : producentsList){
            if (p.canMakeOrder(orderRequest)) {
                return p;
            }
        }
        return null;
    }

    public void orderProcess(OrderRequest orderRequest) {
        Producent p = this.findProducent(orderRequest);
        if (p==null) {
            System.out.println("Nie znaleziono dostawcy dla zamówienia " + orderRequest.toString());
        } else {
            System.out.println("Zamówienie " + orderRequest.toString()+ " zostało przesłane do " + p.getName());
            p.process(orderRequest);

        }
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.inform(orderRequest);
        System.out.println();

    }
}

package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop implements Producent{

    String name;
    long producentID;

    public ExtraFoodShop() {
        this.name = "ExtraFoodShopSpZOO";
        this.producentID = 3581;
    }

    public boolean canMakeOrder(OrderRequest orderRequest) {
        if (orderRequest.getProduct().getProductCode().startsWith("a")) {
            return true;
        }
        return false;
    }

    public void process(OrderRequest order) {
        System.out.println("Yupi. Zamówienie czeka na kuriera");
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

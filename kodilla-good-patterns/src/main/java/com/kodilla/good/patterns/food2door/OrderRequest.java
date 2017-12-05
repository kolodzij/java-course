package com.kodilla.good.patterns.food2door;

public class OrderRequest  {

    private Product product;
    private int quantity;

    public OrderRequest(Product product, int quantity) {
        this.quantity = quantity;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return   product +
                ", quantity=" + quantity;
    }
}

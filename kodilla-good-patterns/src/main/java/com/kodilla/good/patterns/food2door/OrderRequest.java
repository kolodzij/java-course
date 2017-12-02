package com.kodilla.good.patterns.food2door;

public class OrderRequest  {

    Product product;
    int quantity;
  //  ArrayList<Product> productsList;



    public OrderRequest(Product product, int quantity) {
        this.quantity = quantity;
        this.product = product;
    }

    public boolean order() {
        System.out.println("Zamówienie zostało złożone");
        return true;
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

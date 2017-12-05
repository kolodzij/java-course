package com.kodilla.good.patterns.food2door;

public class Product {
    private String name;
    private String productCode;
    private double price;

    public Product(String name, String productCode, double price) {
        this.name = name;
        this.productCode = productCode;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getProductCode() {
        return productCode;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", productCode='" + productCode + '\'';
    }
}

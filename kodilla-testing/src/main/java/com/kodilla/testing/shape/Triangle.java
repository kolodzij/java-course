package com.kodilla.testing.shape;

public class Triangle implements Shape  {
    private double side;
    private double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return "triangle";
    }

    @Override
    public double getField() {
        return 1/2*side*height;
    }
}

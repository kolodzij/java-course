package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> shapes = new ArrayList<Shape>();


    public void addFigure(Shape theShape){
        shapes.add(theShape);
    }

    public boolean removeFigure(Shape theShape) {
        boolean result = false;
        if (shapes.contains(theShape)) {
            shapes.remove(theShape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        Shape theShape = null;
        if (n>=0 && n<shapes.size()) {
            theShape=shapes.get(n);
        }
        return theShape;
    }

    public void showFigures(){
        for (Shape s : shapes) {
            System.out.println("Figure: " + s.getShapeName() + ",field: " + s.getField());
        }
    }

    public int getArraySize(){
        return shapes.size();
    }
}

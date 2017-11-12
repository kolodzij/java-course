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

    public Shape showFigures(){
        return null;
    }

    public int getArraySize(){
        return shapes.size();
    }
}

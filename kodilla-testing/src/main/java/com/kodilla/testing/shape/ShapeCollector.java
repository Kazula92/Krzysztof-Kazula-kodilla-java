package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

import static javax.swing.UIManager.get;

public class ShapeCollector {

    public int showedFiguresCounter = 0;

    private List<Shape> shapeCollector = new ArrayList<>();

    public ShapeCollector(ArrayList<Shape> shapeCollector) {
        this.shapeCollector = shapeCollector;
    }

    public void addFigure(Shape shape){
        shapeCollector.add(shape);
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if(shapeCollector.contains(shape)){
            shapeCollector.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n){
        Shape shape = null;
        if(n<shapeCollector.size() && n>=0) {
            shape = shapeCollector.get(n);
        }
            return shape;
        }

    public String showFigures(){
        StringBuilder figures = new StringBuilder();
        for (Shape showedFigure : shapeCollector) {
            figures.append(showedFigure.toString());
        }
        return figures.toString();
    }
}


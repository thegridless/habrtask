package com.company;

import java.util.ArrayList;

public class Box extends Shape{
    private ArrayList<Shape> shapes =new ArrayList<>();
    private double avalible;

    public Box(double avalible) {
        super(avalible);
        this.avalible=avalible;
    }

    public boolean add(Shape shape){
        if(avalible >= shape.getVolume()){
            shapes.add(shape);
            avalible=-shape.getVolume();
            return true;
        }
        return false;
    }
}

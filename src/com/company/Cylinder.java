package com.company;

public class Cylinder extends SolidOfRevolution {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius*radius*Math.PI*height, radius);
        this.height = height;
    }

}

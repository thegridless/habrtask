package com.company;

public class Pyramid extends Shape{
    private double s;
    private double height;

    public Pyramid(double s, double height) {
        super(height*s*4/3);
        this.height=height;
        this.s=s;
    }

}

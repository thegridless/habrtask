package com.company;

public class Main {
    public static void main(String[] args){
        Ball ball = new Ball(4.5);
        Cylinder cylinder = new Cylinder(2.5,4);
        Pyramid pyramid = new Pyramid(6.8,9);

        Box box = new Box(1000);

        System.out.println(box.add(ball));
        System.out.println(box.add(cylinder));
        System.out.println(box.add(pyramid));

    }

}

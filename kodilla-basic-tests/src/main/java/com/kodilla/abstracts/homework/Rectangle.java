package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    public Rectangle() {
        super(20,15);
    }
    @Override
    public void circuit() {
        int circuit = 20 * 15;
        System.out.println("the perimeter of the rectangle is " + circuit);
    }
    @Override
    public void surfaceArea() {
        int surfaceArea = (2 * 20) + (2 * 15);
        System.out.println("the surface of the rectangle is " + surfaceArea);
    }
}

package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    private int length;
    private int bradth;


    public Rectangle(int length, int bradth) {
        this.length = length;
        this.bradth = bradth;
    }
    @Override
    public double circuit() {
        double circuit = 2 * (length + bradth);
        System.out.println("the perimeter of the rectangle is " + circuit);
        return circuit;
    }
    @Override
    public double surfaceArea() {
        double surfaceArea = length * bradth;
        System.out.println("the surface of the rectangle is " + surfaceArea);
        return surfaceArea;
    }
}

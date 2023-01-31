package com.kodilla.abstracts.homework;

public class Circle extends Shape {

    private int radius;

    public Circle (int radius) {
        this.radius = radius;
    }
    @Override
    public double circuit() {
        double circuit = 2 * Math.PI * radius;
        System.out.println("the perimeter of the circle is " + circuit);
        return circuit;
    }
    @Override
    public double surfaceArea() {
        double surfaceArea = Math.PI * radius * radius;
        System.out.println("the surface of the circle is " + surfaceArea);
        return surfaceArea;
    }
}

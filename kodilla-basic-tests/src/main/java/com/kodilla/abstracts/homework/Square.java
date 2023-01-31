package com.kodilla.abstracts.homework;

public class Square extends Shape {

    private int length;

    public Square(int length) {
        super();
        this.length = length;
    }
    @Override
    public double circuit() {
        double circuit = 4 * length;
        System.out.println("the perimeter of the square is " + circuit);
        return circuit;
    }
    @Override
    public double surfaceArea() {
        double surfaceArea = length * length;
        System.out.println("the surface of the square is " + surfaceArea);
        return  surfaceArea;
    }
}

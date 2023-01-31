package com.kodilla.abstracts.homework;

public class Square extends Shape {

    public Square() {
        super(5, 5);
    }
    @Override
    public void circuit() {
        int circuit = 4 * 5;
        System.out.println("the perimeter of the square is " + circuit);
    }
    @Override
    public void surfaceArea() {
        int surfaceArea = 5 * 5;
        System.out.println("the surface of the square is " + surfaceArea);
    }
}

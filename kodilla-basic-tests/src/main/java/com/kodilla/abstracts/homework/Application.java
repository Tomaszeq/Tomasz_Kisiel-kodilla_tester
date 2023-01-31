package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {

        Square square = new Square(4);
        square.circuit();
        square.surfaceArea();

        Rectangle rectangle = new Rectangle(5, 7);
        rectangle.circuit();
        rectangle.surfaceArea();

        Circle circle = new Circle(5);
        circle.circuit();
        circle.surfaceArea();

    }
}

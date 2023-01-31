package com.kodilla.abstracts.homework;

public abstract class Shape {
//zmienne
    private int length;
    private int breadth;
//konstruktor
    public Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
//brakuje gettera

//metody abstrakcyjne
    public abstract void circuit();
    public abstract void surfaceArea();
}

package com.kodilla.collections.arrays.homework;
import java.util.Random;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Mazda;

public class CarsApplication {

    private String brand;
    private String model;
    private int year;
    private String color;
    private double maxSpeed;
    private double speed;


    public void Car(String brand, String model, int year, String color, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
    }

    private static final Random random = new Random();

    public static void main(String[] args) {
        Random random = new Random();
        int arraySize = random.nextInt(15) + 1;
        Car[] cars = new Car[arraySize];
        for (int i = 0; i < arraySize; i++) {
            cars[i] = drawCar();
        }
        for (Car car : cars) {
            CarUtils.describeCar(car);
            System.out.println();
        }
    }

    public static Car drawCar() {

        int brandIndex = random.nextInt(3);
        int maxSpeed = 120 + random.nextInt(81);
        if(brandIndex == 0) {
            return new Audi(maxSpeed);
        } else if (brandIndex == 1) {
            return new Ford(maxSpeed);
        }
        else {
            return new Mazda(maxSpeed);
        }
    }
}

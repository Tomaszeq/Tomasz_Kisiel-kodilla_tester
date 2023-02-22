package com.kodilla.collections.arrays.homework;
import com.kodilla.collections.interfaces.homework.Car;

import java.util.Random;
public class CarUtils {

    public static void describeCar(Car car) {

        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Color: " + car.getColor());
        System.out.println("Max speed: " + car.getMaxSpeed() + " km/h");
    }
}

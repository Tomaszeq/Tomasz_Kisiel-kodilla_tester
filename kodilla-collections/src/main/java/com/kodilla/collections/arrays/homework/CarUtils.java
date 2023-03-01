package com.kodilla.collections.arrays.homework;
import com.kodilla.collections.interfaces.homework.Car;

import java.util.Random;
public class CarUtils {

    public static void describeCar(Car car) {

        System.out.println("Brand: " + car.getBrand());
        System.out.println("Speed: " + car.getSpeed() + " km/h");
    }
}

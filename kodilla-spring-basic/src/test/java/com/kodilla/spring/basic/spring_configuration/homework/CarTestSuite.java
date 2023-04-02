package com.kodilla.spring.basic.spring_configuration.homework;

public class CarTestSuite {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        Car car = factory.getCarBySeason();

        // Test hasHeadlightsTurnedOn
        if (car.hasHeadlightsTurnedOn()) {
            System.out.println("Headlights are turned on.");
        } else {
            System.out.println("Headlights are turned off.");
        }

        // Test getCarType
        System.out.println("Car type is: " + car.getCarType());
    }
}

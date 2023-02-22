package com.kodilla.collections.arrays.homework;
import java.util.Random;
import com.kodilla.collections.interfaces.homework.Car;
public class CarsApplication {

    private String  brand;
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

        String[] brands = {"Ford", "Toyota", "Chevrolet", "Honda", "BMW"};
        String[] models = {"Mustang", "Corolla", "Camaro", "Accord", "M3"};
        String[] colors = {"Red", "Blue", "Green", "Yellow", "Black"};
        int brandIndex = random.nextInt(brands.length);
        int modelIndex = random.nextInt(models.length);
        int colorIndex = random.nextInt(colors.length);
        int year = 1990 + random.nextInt(31);
        int maxSpeed = 120 + random.nextInt(81);
        Car car = new Car(brands[brandIndex], models[modelIndex], year, colors[colorIndex], maxSpeed);
        return car;
    }
}

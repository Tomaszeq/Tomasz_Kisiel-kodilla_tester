package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Car car1 = new Ford(130);
        Car car2 = new Audi(140);
        Car car3 = new Mazda(150);

        doRace(car1);
        doRace(car2);
        doRace(car3);

    }
    public static void doRace(Car car) {
        for (int i = 0; i < 3; i++) {
            car.increaseSpeed();
        }

        for (int i = 0; i > 2; i++) {
            car.decreaseSpeed();
        }

        System.out.println("aktualna prędkość:" + car.getSpeed());

    }
}

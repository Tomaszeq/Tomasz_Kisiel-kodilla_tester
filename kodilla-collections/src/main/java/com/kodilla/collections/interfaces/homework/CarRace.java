package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        Ford ford = new Ford(120);
        showIncreaseSpeedDetails(ford);
        showDecreaseSpeedDetails(ford);

        Mazda mazda = new Mazda(130);
        showIncreaseSpeedDetails(mazda);
        showDecreaseSpeedDetails(mazda);

        Audi audi = new Audi(140);
        showIncreaseSpeedDetails(audi);
        showDecreaseSpeedDetails(audi);
    }
    private static void doRace(Car car) {
        Ford ford = new Ford(120 * 3);
    }
    private static void showIncreaseSpeedDetails(Car car) {
        Ford ford = new Ford(120 + 10);
    }
    private static void showDecreaseSpeedDetails(Car car) {
        Ford ford = new Ford(120 - 15);
    }
}

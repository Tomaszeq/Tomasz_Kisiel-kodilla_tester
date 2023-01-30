package com.kodilla.inheritance.homework;

public class MainOperatingSystem {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2023);
        operatingSystem.turnOn();

        GrandChildOperatingSystem grandChildOperatingSystem = new GrandChildOperatingSystem(2023);
        grandChildOperatingSystem.turnOff();
    }
}

package com.kodilla.inheritance.homework;

public class GrandChildOperatingSystem extends OperatingSystem {
    public GrandChildOperatingSystem(int year) {
        super(year);
    }
    public void turnOff() {
        System.out.println("Operating system will shut down in 1 min");
    }
}

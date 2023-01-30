package com.kodilla.inheritance.homework;

public class ChildOperatingSystem extends OperatingSystem {
    public ChildOperatingSystem(int year) {
        super(year);
    }
    public void turnOn() {
        System.out.println("Operating system will boot in 30 sec.");
    }

}

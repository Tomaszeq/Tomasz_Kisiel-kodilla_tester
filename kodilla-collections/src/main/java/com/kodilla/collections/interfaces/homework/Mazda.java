package com.kodilla.collections.interfaces.homework;

public class Mazda implements Car {

    private int speed = 0;
    public Mazda (int speed) {
        this.speed = speed;
    }
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed += 30;
    }

    @Override
    public void decreaseSpeed() {
        this.speed -= 35;
    }
}

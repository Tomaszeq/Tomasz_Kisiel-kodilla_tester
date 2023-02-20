package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    private int speed = 0;

    public Ford (int speed) {
        this.speed = speed;

    }
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed += 10;
    }

    @Override
    public void decreaseSpeed() {
        this.speed -= 15;
    }
}

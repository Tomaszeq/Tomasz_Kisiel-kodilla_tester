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

    @Override
    public String getBrand() {
        return getBrand();
    }

    @Override
    public String getModel() {
        return getModel();
    }

    @Override
    public int getYear() {
        return 0;
    }

    @Override
    public String getColor() {
        return getColor();
    }

    @Override
    public int getMaxSpeed() {
        return 0;
    }
    @Override
    public String toString() {
        return "Ford{" +
                "speed=" + speed +
                '}';
    }
}

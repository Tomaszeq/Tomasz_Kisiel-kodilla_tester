package com.kodilla.collections.interfaces.homework;

public class Audi implements Car  {

    private int speed = 0;
    public Audi (int speed) {
        this.speed = speed;
    }
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed += 20;
    }

    @Override
    public void decreaseSpeed() {
        this.speed -= 25;
    }

    @Override
    public String getBrand() {
        return "Audi";
    }
    @Override
    public String toString() {
        return "Audi{" +
                "speed=" + speed +
                '}';
    }
}

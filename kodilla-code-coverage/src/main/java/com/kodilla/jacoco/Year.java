package com.kodilla.jacoco;

public class Year {
    private final int yearValue;

    public Year(int yearValue) {
        this.yearValue = yearValue;
    }

    public boolean isLeap() {
        if (this.yearValue % 4 != 0) {
            return false;
        } else if (this.yearValue % 100 != 0) {
            return true;
        } else if (this.yearValue % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }
}

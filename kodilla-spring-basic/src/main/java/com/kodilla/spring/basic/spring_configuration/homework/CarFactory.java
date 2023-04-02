package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalDate;

class CarFactory {
    public Car getCarBySeason() {
        LocalDate now = LocalDate.now();
        int month = now.getMonthValue();
        if (month >= 3 && month <= 5) {
            return new Sedan();
        } else if (month >= 6 && month <= 8) {
            return new Cabrio();
        } else if (month >= 9 && month <= 11) {
            return new Sedan();
        } else {
            return new Suv();
        }
    }
}

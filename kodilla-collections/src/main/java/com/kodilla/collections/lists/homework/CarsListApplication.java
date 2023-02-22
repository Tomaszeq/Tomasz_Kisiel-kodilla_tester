package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Mazda;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Mazda mazda = new Mazda(130);
        cars.add(mazda);
        cars.add(new Ford( 150));
        cars.add(new Audi(160));

        cars.remove(1);
        cars.remove(mazda);

        System.out.println(cars.size());

        for (Car car : cars) {
            CarUtils.describeCar(car);
            System.out.println(cars);
        }

    }
}

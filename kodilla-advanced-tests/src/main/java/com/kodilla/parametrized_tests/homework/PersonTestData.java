package com.kodilla.parametrized_tests.homework;

import java.util.ArrayList;
import java.util.List;

public class PersonTestData {
    public static List<Person> getTestData() {
        List<Person> testData = new ArrayList<>();
        testData.add(new Person(1.65, 50));
        testData.add(new Person(1.70, 60));
        testData.add(new Person(1.75, 70));
        testData.add(new Person(1.80, 80));
        testData.add(new Person(1.85, 90));
        testData.add(new Person(1.90, 100));
        return testData;
    }
}

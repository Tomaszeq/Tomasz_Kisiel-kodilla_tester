package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class PersonTestSuite {
    @ParameterizedTest
    @CsvFileSource(resources = "/bmiTest.csv", numLinesToSkip = 1)
    public void shouldReturnCorrectBMIForTestData(String heightInMeters, String weightInKilogram, String expectedBmi) {
        Person person = new Person(Double.valueOf(heightInMeters), Double.valueOf(weightInKilogram));
        Assertions.assertEquals(expectedBmi, person.getBMI());

        }
    }
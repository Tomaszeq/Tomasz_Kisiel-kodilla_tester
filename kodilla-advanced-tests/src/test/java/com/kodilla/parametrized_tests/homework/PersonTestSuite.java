package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {
    @Test
    public void shouldReturnCorrectBMIForTestData() {
        List<Person> testData = PersonTestData.getTestData();
        String[] expectedBMIResults = {"Very severely underweight", "Normal (healthy weight)", "Overweight",
                "Overweight", "Overweight", "Obese Class I (Moderately obese)"};

        for (int i = 0; i < testData.size(); i++) {
            assertEquals(expectedBMIResults[i], testData.get(i).getBMI());
        }
    }
}
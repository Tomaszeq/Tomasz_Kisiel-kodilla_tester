package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

public class GamblingMachineTestSuite {
    private final GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/generateComputerNumbers.csv")
    public void shouldReturnCorrectNumberOfWins(String userNumbers, int expectedWins, boolean shouldThrowException) throws InvalidNumbersException {
        if (shouldThrowException) {
            Assertions.assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(convertToSet(userNumbers)));
        } else {
            int actualWins = gamblingMachine.howManyWins(convertToSet(userNumbers));
            Assertions.assertEquals(expectedWins, actualWins);
        }
    }

    private Set<Integer> convertToSet(String numbers) {
        String[] numbersArray = numbers.split(" ");
        Set<Integer> numberSet = new HashSet<>();
        for (String number : numbersArray) {
            numberSet.add(Integer.parseInt(number));
        }
        return numberSet;
    }
}
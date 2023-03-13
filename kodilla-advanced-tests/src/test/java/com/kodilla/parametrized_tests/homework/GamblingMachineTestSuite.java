package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

class GamblingMachineTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/GamblingMachineNumbers.csv", numLinesToSkip = 1)
    void shouldReturnCorrectNumberOfWinsForValidInput(String input, int expectedOutput) throws InvalidNumbersException {
        GamblingMachine gamblingMachine = new GamblingMachine();
        Set<Integer> userNumbers = convertToSet(input);

        int actualOutput = gamblingMachine.howManyWins(userNumbers);

        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/InvalidNumbers.csv", numLinesToSkip = 1)
    void shouldThrowExceptionForInvalidInput(String input) {
        GamblingMachine gamblingMachine = new GamblingMachine();
        Set<Integer> userNumbers = convertToSet(input);

        Assertions.assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(userNumbers));
    }

    private Set<Integer> convertToSet(String input) {
        String[] numbers = input.split(" ");
        Set<Integer> numberSet = new HashSet<>();
        for (String number : numbers) {
            numberSet.add(Integer.parseInt(number));
        }
        return numberSet;
    }
}
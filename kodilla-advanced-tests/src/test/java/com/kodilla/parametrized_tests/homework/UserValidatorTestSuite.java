package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.SplittableRandom;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {
    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @CsvSource(value = {"User123", "User_123", "User-123", "User.123", "User", "123"})
    public void shouldReturnTrueForValidUsername(String input) {
    assertTrue(validator.validateUsername(input));
    }
    @ParameterizedTest
    @CsvSource(value = {"Us", "U", "_r", "U-", "r.", "U_3$", "User123*"})
    public void shouldReturnFalseForValidUsername(String input) {
        assertFalse(validator.validateUsername(input));
    }
    @ParameterizedTest
    @CsvSource(value = {"test123@test.com", "Test123@test.com"})
    public void shouldReturnTrueForValidEmail(String input) {
        assertTrue(validator.validateEmail(input));
    }
    @ParameterizedTest
    @CsvSource(value = {"test*123@test.com", "test,123@test.com", "test123,test.com", "test@123,com"})
    public void shouldReturnFalseForValidEmail(String input) {
        assertFalse(validator.validateEmail(input));
    }
}
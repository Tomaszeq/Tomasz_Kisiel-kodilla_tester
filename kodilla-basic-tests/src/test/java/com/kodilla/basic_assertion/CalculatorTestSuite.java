package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }
    @Test
    public void testSubstract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subtractResult = calculator.subtract(a, b);
        assertEquals(-3, subtractResult);
    }
    @Test
    public void testExponentiationPositive() {
        Calculator calculator = new Calculator();
        int a = 4;
        double actual = calculator.exponentiation(a);
        assertEquals(16, actual, 0.01);
    }
    @Test
    public void testExponentiationNegative() {
        Calculator calculator = new Calculator();
        int a = -4;
        double actual = calculator.exponentiation(a);
        assertEquals(16, actual, 0.01);
    }
    @Test
    public void testExponentiationZero() {
        Calculator calculator = new Calculator();
        int a = 0;
        double actual = calculator.exponentiation(a);
        assertEquals(0, actual, 0.01);
    }
}

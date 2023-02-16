package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
        int[] completedTransactions = cashMachine.getCompletedTransactions();
        assertEquals(0, completedTransactions.length);
    }
    @Test
    public void shouldAddTwoElementsToArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(4);
        cashMachine.add(2);

        int[] completedTransactions = cashMachine.getCompletedTransactions();
        assertEquals(2,completedTransactions.length);
        assertEquals(4,completedTransactions[0]);
        assertEquals(2, completedTransactions[1]);
    }
}

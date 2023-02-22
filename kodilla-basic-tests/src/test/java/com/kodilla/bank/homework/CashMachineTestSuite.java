package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import javax.swing.plaf.PanelUI;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    @Test
    public void testCashMachine() {
        CashMachine cashMachine = new CashMachine();
        int[] completedTransactions = cashMachine.getCompletedTransactions();
        assertEquals(0, completedTransactions.length);
    }
    @Test
    public void testCashMachine2() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(1);
        cashMachine.add(2);
        cashMachine.add(3);

        int[] completedTransactions = cashMachine.getCompletedTransactions();
        assertEquals(3, completedTransactions.length);
        assertEquals(1, completedTransactions[0]);
        assertEquals(2, completedTransactions[1]);
    }
    @Test
    public void testSaldo() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(100);
        cashMachine.add(150);
        cashMachine.add(-150);
        cashMachine.add(35);
        cashMachine.add(0);
        cashMachine.add(15);
        assertEquals(150, cashMachine.getSaldo());
    }
    @Test
    public void testWithdrawalQty() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(100);
        cashMachine.add(200);
        cashMachine.add(400);
        assertEquals(700, cashMachine.getWithdrawalQty());
    }
    @Test
    public void testPaymentQty() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(50);
        cashMachine.add(100);
        cashMachine.add(450);
        assertEquals(600, cashMachine.getPaymentQty());
    }
    @Test
    public void testWithdrawalAvg() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(100);
        cashMachine.add(200);
        cashMachine.add(400);
        assertEquals(433.33, cashMachine.getWithdrawalAvg());
    }
    @Test
    public void testPaymentAvg() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(50);
        cashMachine.add(100);
        cashMachine.add(450);
        assertEquals(300, cashMachine.getPaymentAvg());
    }
}
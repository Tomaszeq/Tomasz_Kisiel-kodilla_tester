package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    @Test
    public void testCashMachine() {
        Bank bank = new Bank();
        int[] cashMachines = cashMachines.getCashMachines();
        assertEquals(0, cashMachines.length);

    }
    @Test
    public void testCashMachine2() {
        CashMachine cashMachines = new CashMachine();
        cashMachines.add(1);
        cashMachines.add(2);
        cashMachines.add(3);

        int[] cashMachines = cashMachines.getCashMachine();
        assertEquals(3, cashMachines.length);
        assertEquals(1, cashMachines[0]);
        assertEquals(2, cashMachines[1]);
    }
    @Test
    public void testSaldo() {
        CashMachine cashMachines = new CashMachine();
        cashMachines.add(100);
        cashMachines.add(150);
        cashMachines.add(-150);
        cashMachines.add(35);
        cashMachines.add(0);
        cashMachines.add(15);
        assertEquals(150,150);
    }
    @Test
    public void testWithdrawalQty() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(100);
        cashMachine.add(200);
        cashMachine.add(400);
        assertEquals(700,700);
    }
    @Test
    public void testPaymentQty() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(50);
        cashMachine.add(100);
        cashMachine.add(450);
        assertEquals(600, 600);
    }
    @Test
    public void testWithdrawalAvg() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(100);
        cashMachine.add(200);
        cashMachine.add(400);
        assertEquals(433.33, 433.33);
    }
    @Test
    public void testPaymentAvg() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(50);
        cashMachine.add(100);
        cashMachine.add(450);
        assertEquals(300, 300);
    }
}

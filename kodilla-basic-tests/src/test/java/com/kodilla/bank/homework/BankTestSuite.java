package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void testCashMachine() {
        Bank bank = new Bank();
        bank.add(new CashMachine());
        bank.add(new CashMachine());
        bank.add(new CashMachine());
        bank.add(new CashMachine());
        bank.add(new CashMachine());
        bank.add(new CashMachine());

        assertEquals( 0, bank.getSaldo());

    }
    @Test
    public void testSaldo() {
        Bank bank = new Bank();

        bank.add(new CashMachine());
        bank.add(new CashMachine());
        bank.add(new CashMachine());
        bank.add(new CashMachine());

        assertEquals(0, bank.getSaldo());

    }
    @Test
    public void testPaymentQty() {
        Bank bank = new Bank();

        bank.add(new CashMachine());
        bank.add(new CashMachine());
        bank.add(new CashMachine());
        bank.add(new CashMachine());
        bank.add(new CashMachine());

        assertEquals(0, bank.getPaymentQty());
    }
    @Test
    public void testWithdrawalAvg() {
        Bank bank = new Bank();

        bank.add(new CashMachine());
        bank.add(new CashMachine());
        bank.add(new CashMachine());
        bank.add(new CashMachine());
        bank.add(new CashMachine());

        assertEquals(0, bank.getWithdrawalAvg());
    }
    @Test
    public void testPaymentAvg() {
        Bank bank = new Bank();

        bank.add(new CashMachine());
        bank.add(new CashMachine());
        bank.add(new CashMachine());
        bank.add(new CashMachine());

        assertEquals(0, bank.getPaymentAvg());
    }
}

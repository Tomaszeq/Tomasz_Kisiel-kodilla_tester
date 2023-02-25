package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankTestSuite {

    @Test
    public void shouldCalculateCorrectSaldo() {
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();

        cashMachine1.add(500);
        cashMachine1.add(-200);
        cashMachine2.add(1000);
        cashMachine2.add(-300);
        cashMachine2.add(-500);

        bank.add(cashMachine1);
        bank.add(cashMachine2);

        assertEquals(500, bank.getSaldo());
    }

    @Test
    public void shouldReturnZeroSaldoForEmptyBank() {
        Bank bank = new Bank();
        assertEquals(0, bank.getSaldo());
    }

    @Test
    public void shouldCalculateCorretWithdrawalQty() {
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();

        cashMachine1.add(500);
        cashMachine1.add(-200);
        cashMachine2.add(1000);
        cashMachine2.add(-300);
        cashMachine2.add(-500);

        bank.add(cashMachine1);
        bank.add(cashMachine2);

        assertEquals(3, bank.getWithdrawalQty());
    }

    @Test
    public void shouldCalculateCorrectPaymentQty() {
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();

        cashMachine1.add(500);
        cashMachine1.add(-200);
        cashMachine2.add(1000);
        cashMachine2.add(-300);
        cashMachine2.add(-500);

        bank.add(cashMachine1);
        bank.add(cashMachine2);

        assertEquals(2, bank.getPaymentQty());
    }

    @Test
    public void shouldCalculateCorrectWithdrawalAvg() {
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();

        cashMachine1.add(500);
        cashMachine1.add(-200);
        cashMachine2.add(1000);
        cashMachine2.add(-300);
        cashMachine2.add(-500);

        bank.add(cashMachine1);
        bank.add(cashMachine2);

        assertEquals(-183.33333333333334, bank.getWithdrawalAvg());
    }

    @Test
    public void shouldReturnZeroWithdrawalAvgForEmptyBank() {
        Bank bank = new Bank();
        assertEquals(0, bank.getWithdrawalAvg());
    }

    @Test
    public void shouldCalculateCorrectPaymentAvg() {
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();

        cashMachine1.add(500);
        cashMachine1.add(-200);
        cashMachine2.add(1000);
        cashMachine2.add(-300);
        cashMachine2.add(-500);

        bank.add(cashMachine1);
        bank.add(cashMachine2);

        assertEquals(291.66, bank.getPaymentAvg(), 0.1);
    }

    @Test
    public void shouldReturnZeroPaymentAvgForEmptyBank() {
        Bank bank = new Bank();
        assertEquals(0, bank.getPaymentAvg());
    }
}
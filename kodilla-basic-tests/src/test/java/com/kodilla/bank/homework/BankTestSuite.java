package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankTestSuite {

    @Test
    public void shouldCalculateCorrectSaldo() {
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();

        cashMachine1.addTransaction(500);
        cashMachine1.addTransaction(-200);
        cashMachine2.addTransaction(1000);
        cashMachine2.addTransaction(-300);
        cashMachine2.addTransaction(-500);

        bank.add(cashMachine1);
        bank.add(cashMachine2);

        assertEquals(500, 500);
    }

    @Test
    public void shouldReturnZeroSaldoForEmptyBank() {
        Bank bank = new Bank();
        assertEquals(0, bank.getSaldo());
    }

    @Test
    public void shouldCalculateCorrectPaymentQty() {
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();

        cashMachine1.addTransaction(500);
        cashMachine1.addTransaction(-200);
        cashMachine2.addTransaction(1000);
        cashMachine2.addTransaction(-300);
        cashMachine2.addTransaction(-500);

        bank.add(cashMachine1);
        bank.add(cashMachine2);

        assertEquals(5, bank.getPaymentQty());
    }

    @Test
    public void shouldCalculateCorrectWithdrawalAvg() {
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();

        cashMachine1.addTransaction(500);
        cashMachine1.addTransaction(-200);
        cashMachine2.addTransaction(1000);
        cashMachine2.addTransaction(-300);
        cashMachine2.addTransaction(-500);

        bank.add(cashMachine1);
        bank.add(cashMachine2);

        assertEquals(-333.33, bank.getWithdrawalAvg());
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

        cashMachine1.addTransaction(500);
        cashMachine1.addTransaction(-200);
        cashMachine2.addTransaction(1000);
        cashMachine2.addTransaction(-300);
        cashMachine2.addTransaction(-500);

        bank.add(cashMachine1);
        bank.add(cashMachine2);

        assertEquals(600, bank.getWithdrawalAvg());
    }

    @Test
    public void shouldReturnZeroPaymentAvgForEmptyBank() {
        Bank bank = new Bank();
        assertEquals(0, bank.getPaymentAvg());
    }
}
package com.kodilla.bank.homework;

public class Bank {
    private int size;
    private CashMachine[] cashMachines = new CashMachine[0];

    public Bank () {
        this.cashMachines = new CashMachine[0];
        this.size = 0;
    }
    public void  add (CashMachine cashMachine) {
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(cashMachines, 0, newTab, 0, cashMachines.length);
        newTab[this.size -1] = cashMachine;
        this.cashMachines = newTab;
    }
    public double getSaldo() {
        if (this.cashMachines.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            sum += this.cashMachines[i].getSaldo();
        }
        return sum;
    }
    public int getPaymentQty() {
        if (this.cashMachines.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            sum += this.cashMachines[i].getPaymentQty();
        }
        return sum;
    }
    public double getWithdrawalAvg() {
        if (this.cashMachines.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            if (this.cashMachines[i].getWithdrawalAvg() < 0) {
                sum += this.cashMachines[i].getWithdrawalQty();
            }
        }
        return sum / cashMachines.length;
    }
    public double getPaymentAvg() {
        if (this.cashMachines.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < this.cashMachines.length; i++ ) {
            if (this.cashMachines[i].getPaymentAvg() > 0) {
                sum += this.cashMachines[i].getPaymentAvg();
            }
        }
        return sum / cashMachines.length;
    }
}

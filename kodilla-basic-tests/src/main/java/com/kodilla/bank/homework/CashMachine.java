package com.kodilla.bank.homework;
import com.kodilla.basic_assertion.Calculator;

public class CashMachine {
    private int[] completedTransactions;
    private int size;

    public CashMachine() {
        this.completedTransactions = new int[0];
        this.size = 0;
    }
    public void add (int completedTransaction) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(completedTransactions, 0,newTab,0, completedTransactions.length);
        newTab[this.size -1] = completedTransaction;
        this.completedTransactions = newTab;
    }
    public int[] getCompletedTransactions() {
        return completedTransactions;
    }
    public double getSaldo() {
        if (this.completedTransactions.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.completedTransactions.length; i++) {
            sum += this.completedTransactions[i];
        }
        return sum;
    }
    public int getWithdrawalQty() {
        if (this.completedTransactions.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < completedTransactions.length; i++) {
            if (this.completedTransactions[i] < 0) {
                sum ++;
            }
        }
        return sum;
    }
    public int getPaymentQty() {
        if (this.completedTransactions.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < completedTransactions.length; i++) {
            if (this.completedTransactions[i] > 0) {
                sum ++;
            }
        }
        return sum;
    }
    public double getWithdrawalAvg() {
        if (this.completedTransactions.length == 0) {
            return 0;
        }
        double sum = 0;

        for (int i = 0; i < this.completedTransactions.length; i++) {
            if (this.completedTransactions[i] < 0) {
                sum += this.completedTransactions[i];
            }
        }
        return sum / completedTransactions.length;
    }
    public double getPaymentAvg() {
        if (this. completedTransactions.length == 0) {
            return 0;
        }
        double sum = 0;

        for (int i = 0; i < this.completedTransactions.length; i++) {
            if (this.completedTransactions[i] > 0) {
                sum += this.completedTransactions[i];
            }
        }
        return sum / completedTransactions.length;
    }
}

package com.kodilla.bank.homework;

public class Bank {
    private CashMachine Euronet;
    private CashMachine BNPParibas;
    private CashMachine Pekao;

    CashMachine[] CashMachines = new CashMachine[] {Euronet, BNPParibas, Pekao};

    public Bank() {
        this.Euronet = new CashMachine();
        this.BNPParibas = new CashMachine();
        this.Pekao = new CashMachine();
    }
    public void addEuronetCash (int cash) {
        this.Euronet.add(cash);
    }
    public void addBNPParibas (int cash) {
        this.BNPParibas.add(cash);
    }
    public void addPekao (int cash) {
        this.Pekao.add(cash);
    }
    public double getCashMashineSaldo() {
        return this.Euronet.getSaldo() + this.BNPParibas.getSaldo() + this.Pekao.getSaldo();
    }
    public int getWithdrawningCash() {
        return this.Euronet.getWithdrawning() + this.BNPParibas.getWithdrawning() + this.Pekao.getWithdrawning();
    }
    public int getPaymentCash() {
        return this.Euronet.getPayment() + this.BNPParibas.getPayment() + this.Pekao.getPayment();
    }
    public double getCashOutAvg() {
        for (int i = 0; i < this.CashMachines.length; i++) {
            new CashMachine().getCashOutsAvg();
        }
        return 0;
    }
}

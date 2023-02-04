package com.kodilla.abstracts.homework;

public class Lawyer extends Job {
    public Lawyer(double salary, String responsibilities) {
        super(salary, responsibilities);
    }

    @Override
    public double salary() {
        double salary = 8.432;
        System.out.println("Lawyer salary: " + salary);
        return salary;
    }
    @Override
    public String responsibilities() {
        String responsibilities = "moral and legal obligation";
        System.out.println("A lawyer's duty is to act as an attorney in court");
        return responsibilities;
    }
    @Override
    public String duty() {
        String duty = "moral and legal obligation";
        System.out.println("Lawyer providing legal assistance, in particular on defence");
        return duty;
    }
}

package com.kodilla.abstracts.homework;

public class Lawyer extends Job {

    public Lawyer() {
        super(8.432, "acting as an attorney in court");
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
}

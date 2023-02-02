package com.kodilla.abstracts.homework;

public class Soldier extends Job {

    public Soldier() {
        super(4.543, "Defense of the homeland");
    }
    @Override
    public double salary() {
        double salary = 4.543;
        System.out.println("Soldier salary: " + salary);
        return salary;
    }
    @Override
    public String responsibilities() {
        String responsibilities = "moral and legal obligation";
        System.out.println("A soldier's duty is to defend the homeland");
        return responsibilities;
    }
}

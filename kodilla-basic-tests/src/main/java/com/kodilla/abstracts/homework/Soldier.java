package com.kodilla.abstracts.homework;

public class Soldier extends Job {
    public Soldier(double salary, String responsibilities) {
        super(salary, responsibilities);
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
    @Override
    public String duty() {
        String duty = "moral and legal obligation";
        System.out.println("Soldiers special duty - " +
                "to defend the State and to devote oneself to the service of the Nation and Homeland.");
        return duty;
    }
}

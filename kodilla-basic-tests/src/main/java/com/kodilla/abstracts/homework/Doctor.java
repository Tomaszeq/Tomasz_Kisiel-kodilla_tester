package com.kodilla.abstracts.homework;

public class Doctor extends Job {

    public Doctor() {
        super(5.987, "providing medical assistance");
    }
    @Override
    public double salary() {
        double salary = 5.987;
        System.out.println("Doctor salary: " + salary);
        return salary;
    }
    @Override
    public String responsibilities() {
        String responsibilities = "moral and legal obligation";
        System.out.println("A doctor's duty is to provide medical assistance");
        return responsibilities;
    }
}

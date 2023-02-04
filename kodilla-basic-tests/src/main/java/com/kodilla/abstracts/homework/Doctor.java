package com.kodilla.abstracts.homework;

public class Doctor extends Job {
    public Doctor(double salary, String responsibilities) {
        super(salary, responsibilities);
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
    @Override
    public String duty() {
        String duty = "moral and legal obligation";
        System.out.println("Doctor provide you with medical assistance in any situation where delay would threaten your health or life.");
        return duty;
    }
}

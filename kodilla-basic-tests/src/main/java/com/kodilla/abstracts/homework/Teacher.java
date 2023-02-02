package com.kodilla.abstracts.homework;

public class Teacher extends Job {

    public Teacher() {
        super(2.765, "moral and legal obligation");
    }
    @Override
    public double salary() {
        double salary = 2.765;
        System.out.println("Teacher salary: " + salary);
        return salary;
    }
    @Override
    public String responsibilities() {
        String responsibilities = "moral and legal obligation";
        System.out.println("The teacher is responsible for his students during the lesson");
        return responsibilities;
    }
}

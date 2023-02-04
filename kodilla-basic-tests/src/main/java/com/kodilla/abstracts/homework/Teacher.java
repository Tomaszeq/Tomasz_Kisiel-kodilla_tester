package com.kodilla.abstracts.homework;

public class Teacher extends Job {
    public Teacher(double salary, String responsibilities) {
        super(salary, responsibilities);
    }
    @Override
    public double salary() {
        double salary = 3.000;
        System.out.println("Teachers salary: " + salary);
        return salary;
    }
    @Override
    public String responsibilities() {
        String responsibilities = "moral and legal obligation";
        System.out.println("The teacher is responsible for his students during the lesson");
        return responsibilities;
    }
    @Override
    public String duty() {
        String duty = "moral and legal obligation";
        System.out.println("Teacher take care of shaping students' moral and civic attitudes in accordance with the idea of democracy, " +
                "peace and friendship between people of different nationalities, races and worldviews.");
        return duty;
    }
}

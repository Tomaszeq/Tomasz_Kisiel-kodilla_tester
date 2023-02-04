package com.kodilla.abstracts.homework;

public class Person {
    private String firstName;
    private Job job;
    private int age;

    public Person (String  firstName, Job job, int age) {
        this.firstName = firstName;
        this.job = job;
        this.age = age;
    }
    public String getFirstName() {
        return firstName;
    }
    public Job getJob() {
        return job;
    }
    public int getAge() {
        return age;
    }
    public void process(Job job) {
        System.out.println(getFirstName() + "" + getAge() + "" + getJob() + "");
    }
}

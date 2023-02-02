package com.kodilla.abstracts.homework;

public class JobApplication {
    public static void main(String[] args) {

        Teacher teacher = new Teacher();
        teacher.salary();
        teacher.responsibilities();

        Doctor doctor = new Doctor();
        doctor.salary();
        doctor.responsibilities();

        Lawyer lawyer = new Lawyer();
        lawyer.salary();
        lawyer.responsibilities();

        Soldier soldier = new Soldier();
        soldier.salary();
        soldier.responsibilities();

    }
}

package com.kodilla.abstracts.homework;

public class JobApplication {
    public static void main(String[] args) {

        Teacher teacher = new Teacher(3.000,"moral and legal obligation");
        teacher.salary();
        teacher.responsibilities();
        teacher.duty();

        Doctor doctor = new Doctor(5.987,"moral and legal obligation");
        doctor.salary();
        doctor.responsibilities();
        doctor.duty();

        Lawyer lawyer = new Lawyer(8.432,"moral and legal obligation");
        lawyer.salary();
        lawyer.responsibilities();
        lawyer.duty();

        Soldier soldier = new Soldier(4.543,"moral and legal obligation");
        soldier.salary();
        soldier.responsibilities();
        soldier.duty();

        Person person = new Person("Aleksandra",teacher, 30);
    }
}

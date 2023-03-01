package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Teacher teacher1 = new Teacher("Anna Nowak");
        Teacher teacher2 = new Teacher("Jan Kowalski");
        Teacher teacher3 = null;

        students.add(new Student("Jaś", teacher1));
        students.add(new Student("Małgosia", teacher2));
        students.add(new Student("Adaś", teacher3));

        for(Student student : students) {
            String teacherName = Optional.ofNullable(student.getTeacher())
                    .map(Teacher::getName)
                    .orElse("undefined");
            System.out.println("uczeń: " + student.getName() + ", nauczyciel: " + teacherName);
        }
    }
}

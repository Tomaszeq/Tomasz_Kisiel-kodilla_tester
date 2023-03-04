package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jan Kowalski", new Teacher("Tomasz Nowak")));
        students.add(new Student("Anna Nowak", null));
        students.add(new Student("Piotr Wójcik", new Teacher("Michał Wiśniewski")));

        for (Student student : students) {
            System.out.print("Uczeń: " + student.getName() + ", nauczyciel: ");
            Optional<Teacher> teacher = student.getTeacher();
            if (teacher.isPresent()) {
                System.out.println(teacher.get().getName());
            } else {
                System.out.println("<undefined>");
            }
        }
    }

}

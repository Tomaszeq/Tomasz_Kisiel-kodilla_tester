package com.kodilla.collections.adv.maps.complex.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<School, Principal> schoolDirectory = new HashMap<>();

        School school1 = new School("LO nr I", new int[] {20, 22, 18});
        Principal principal1 = new Principal("Jan Kowalski");
        schoolDirectory.put(school1, principal1);

        School school2 = new School("LO nr II", new int[] {25, 27, 23});
        Principal principal2 = new Principal("Piotr Nowak");
        schoolDirectory.put(school2, principal2);

        School school3 = new School("LO nr III", new int[] {30, 32, 28});
        Principal principal3 = new Principal("Andrzej Malinowski");
        schoolDirectory.put(school3, principal3);

        for (Map.Entry<School, Principal> entry : schoolDirectory.entrySet()) {
            School school = entry.getKey();
            Principal principal = entry.getValue();
            int totalStudents = school.getTotalStudents();

            System.out.println("Director: " + principal.getName());
            System.out.println("School: " + school.getName());
            System.out.println("Liczba uczniów: " + totalStudents);
            System.out.println();
        }
    }
}

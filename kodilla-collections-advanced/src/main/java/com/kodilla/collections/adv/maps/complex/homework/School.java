package com.kodilla.collections.adv.maps.complex.homework;

import java.util.ArrayList;

public class School {
    private String name;
    private int[] studentCounts;

    public School(String name, int[] studentCounts) {
        this.name = name;
        this.studentCounts = new int[studentCounts.length];
        for (int i = 0; i < studentCounts.length; i++) {
            this.studentCounts[i] = studentCounts[i];
        }
    }
    public String getName() {
        return name;
    }
    public int getTotalStudents() {
        int totalStudents = 0;
        for (int count : studentCounts) {
            totalStudents += count;
        }
        return totalStudents;
    }
}

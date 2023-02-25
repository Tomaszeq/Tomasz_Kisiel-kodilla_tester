package com.kodilla.collections.adv.immutable.homework;

public record TaskRecord(String title, int duration, int year) {
    static TaskRecord taskRecord = new TaskRecord("test", 22, 2222);
}

package com.kodilla.collections.adv.immutable;

public record BookRecord(String author, String title, int year) {
    public static void main(String[] args) {
        BookRecord bookRecord = new BookRecord(“test”, “testowa pozycja”, 2022);
    }
}

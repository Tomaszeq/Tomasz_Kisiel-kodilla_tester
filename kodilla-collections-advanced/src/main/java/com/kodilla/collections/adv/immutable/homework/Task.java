package com.kodilla.collections.adv.immutable.homework;

public record Task(String title, int duration) {

    public String getTitle() {
        return title;
    }
    public int getDuration() {
        return duration;
    }
}

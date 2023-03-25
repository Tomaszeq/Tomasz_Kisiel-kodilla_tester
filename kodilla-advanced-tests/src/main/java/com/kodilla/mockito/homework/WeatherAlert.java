package com.kodilla.mockito.homework;


import java.util.HashSet;
import java.util.Set;

public class WeatherAlert {
    private Set<Subscriber> subscribers = new HashSet<>();

    public void addSubscriber(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }
    public void sendLocalisation(Localisation localisation) {
        this.subscribers.forEach(subscriber -> subscriber.receive(localisation));
    }
    public void removeLocalisation(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }
    public void removeSubscriber(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }
}

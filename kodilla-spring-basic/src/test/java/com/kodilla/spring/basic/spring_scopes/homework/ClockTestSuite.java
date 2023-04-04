package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertNotEquals;


@SpringBootTest
public class ClockTestSuite {
    @Autowired
    private ApplicationContext context;

    @Test
    public void testDifferentClockInstances() {
        Clock clock1 = new Clock();
        Clock clock2 = new Clock();

        // Zmiana czasu w jednym z zegarów
        clock1.setCurrentTime(LocalTime.now().plusHours(1));

        // Sprawdzenie, czy czasy są różne
        assertNotEquals(clock1.getCurrentTime(), clock2.getCurrentTime());
    }
}

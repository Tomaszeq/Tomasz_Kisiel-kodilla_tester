package com.kodilla.mockito.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherAlertsTestSuite {
    private WeatherAlert weatherAlert;
    private Subscriber subscriber;
    private Localisation localisation;

    @BeforeEach
    public void setUp() {
        weatherAlert = new WeatherAlert();
        subscriber = Mockito.mock(Subscriber.class);
        localisation = Mockito.mock(Localisation.class);
    }
    @Test
    public void subscribersShouldReceiveLocalisation() {
        weatherAlert.addSubscriber(subscriber);
        weatherAlert.sendLocalisation(localisation);
        Mockito.verify(subscriber, Mockito.times(1)).receive(localisation);
    }
    @Test
    public void localisationShouldBeSendToAllSubscribers() {
        Subscriber firstSubscriber = Mockito.mock(Subscriber.class);
        Subscriber secoundSubscriber = Mockito.mock(Subscriber.class);
        Subscriber thirdSubscriber = Mockito.mock(Subscriber.class);
        weatherAlert.addSubscriber(firstSubscriber);
        weatherAlert.addSubscriber(secoundSubscriber);
        weatherAlert.addSubscriber(thirdSubscriber);

        weatherAlert.sendLocalisation(localisation);

        Mockito.verify(firstSubscriber, Mockito.times(1)).receive(localisation);
        Mockito.verify(secoundSubscriber, Mockito.times(1)).receive(localisation);
        Mockito.verify(thirdSubscriber, Mockito.times(1)).receive(localisation);
    }
    @Test
    public void unsubscribedClientShouldNotReceiveLocalisation() {
        weatherAlert.addSubscriber(subscriber);
        weatherAlert.removeLocalisation(subscriber);

        weatherAlert.sendLocalisation(localisation);

        Mockito.verify(subscriber, Mockito.never()).receive(localisation);

    }
}

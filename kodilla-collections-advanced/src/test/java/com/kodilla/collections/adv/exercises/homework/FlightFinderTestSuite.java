package com.kodilla.collections.adv.exercises.homework;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
public class FlightFinderTestSuite {
    @Test
    public void shouldReturnFlightsFromGivenDeparture() {
        FlightRepository flightRepository = new FlightRepository();
        List<Flight> flights = flightRepository.getFlightsTable();
        FlightFinder flightFinder = new FlightFinder(flights);
        List<Flight> foundFlights = flightFinder.findFlightsFrom("Warszawa");

        assertEquals(3, foundFlights.size());
        assertEquals("Warszawa", foundFlights.get(0).getDeparture());
        assertEquals("Londyn", foundFlights.get(0).getArrival());
        assertEquals("Warszawa", foundFlights.get(1).getDeparture());
        assertEquals("Paryż", foundFlights.get(1).getArrival());
        assertEquals("Warszawa", foundFlights.get(2).getDeparture());
        assertEquals("Berlin", foundFlights.get(2).getArrival());
    }
    @Test
    public void shouldReturnFlightsToGivenArrival() {
        FlightRepository flightRepository = new FlightRepository();
        List<Flight> flights = flightRepository.getFlightsTable();
        FlightFinder flightFinder = new FlightFinder(flights);
        List<Flight> foundFlights = flightFinder.findFlightsTo("Krakow");

        assertEquals(0, foundFlights.size());
    }
}
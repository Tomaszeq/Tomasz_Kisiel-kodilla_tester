package com.kodilla.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirportRepositoryTestSuite {

    @Test
    public void testIsAirportInUse() throws AirportNotFoundException {
        AirportRepository airportRepository = new AirportRepository();
        boolean IsWarsawInUse = airportRepository.isAirportInUse("Warsaw");
        assertTrue(IsWarsawInUse);
    }

    @Test
    public void testIsAirportInUse_withExceptions() {
        AirportRepository airportRepository = new AirportRepository();
        assertThrows(AirportNotFoundException.class, () -> airportRepository.isAirportInUse("Vienna"));
    }

}
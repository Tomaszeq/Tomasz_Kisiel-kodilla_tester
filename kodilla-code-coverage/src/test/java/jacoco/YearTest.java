package jacoco;

import com.kodilla.jacoco.Year;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class YearTest {

    @Test
    void shouldBeLeapYearIfDivisibleBy4AndNotDivisibleBy100() {
        Year year = new Year(2008);
        assertTrue(year.isLeap());
    }

    @Test
    void shouldNotBeLeapYearIfNotDivisibleBy4() {
        Year year = new Year(2009);
        assertFalse(year.isLeap());
    }

    @Test
    void shouldBeLeapYearIfDivisibleBy400() {
        Year year = new Year(2000);
        assertTrue(year.isLeap());
    }

    @Test
    void shouldNotBeLeapYearIfDivisibleBy100ButNotBy400() {
        Year year = new Year(1700);
        assertFalse(year.isLeap());
    }
}
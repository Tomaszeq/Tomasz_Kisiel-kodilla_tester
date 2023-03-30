package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;

public class ShopTestSuite {
    @Test
    void shouldAddAndCountOrder() {
        //given
        Shop shop = new Shop();
        Order order = new Order("Laptop", 1, LocalDate.of(2023, 03, 30), 5000.0);
        //when
        shop.addOrder(order);
        //then
        assertEquals(1, shop.getNumberOfOrders());
    }
    @Test
    void shouldFindOrdersFromRangeOfDates() {
        //given
        Shop shop = new Shop();
        Order order1 = new Order("Laptop", 1, LocalDate.of(2022, 01, 29), 5000.0);
        Order order2 = new Order("Mobile Phone", 2, LocalDate.of(2022, 02, 28), 4000.0);
        Order order3 = new Order("Watch", 3, LocalDate.of(2022, 03, 27), 2000.0);

        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        //when
        List<Order> result = shop.findOrdersFromDatesRange(LocalDate.of(2022,01,01), LocalDate.of(2022,02,28));
        //then
        assertEquals(2, result.size());
    }
    @Test
    void shouldFindOrdersFromRangeOfValues() {
        //given
        Shop shop = new Shop();
        Order order1 = new Order("Laptop", 1, LocalDate.of(2023, 03, 29), 5000.0);
        Order order2 = new Order("Mobile Phone", 2, LocalDate.of(2023, 03, 28), 4000.0);
        Order order3 = new Order("Watch", 3, LocalDate.of(2023, 03, 27), 2000.0);

        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        //when
        List<Order> result = shop.findOrdersFromValuesRange(1000.0, 8000.0);
        //then
        assertEquals(3, result.size());
    }
    @Test
    void shouldCalculateValueOfOrders() {
        //given
        Shop shop = new Shop();
        Order order1 = new Order("Laptop", 1, LocalDate.of(2023, 03, 29), 5000.0);
        Order order2 = new Order("Mobile Phone", 2, LocalDate.of(2023, 03, 28), 4000.0);
        Order order3 = new Order("Watch", 3, LocalDate.of(2023, 03, 27), 2000.0);

        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        //when
        double result = shop.calculateValueOfOrders();
        //then
        assertEquals(19000.0, result, 0.001);
    }
}

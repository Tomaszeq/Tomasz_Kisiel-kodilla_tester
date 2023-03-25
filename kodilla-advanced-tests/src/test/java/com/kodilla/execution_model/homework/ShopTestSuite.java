package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class ShopTestSuite {
    private Shop shop;

    @BeforeEach
    public void setUp() {
        shop = new Shop();
    }

    @Test
    public void shouldReturnOneOrderWhenAddingTwoSameOrders() {
        Set<Order> orders = new HashSet<>();
        orders.add(new Order(2.999, LocalDate.of(2023, 03, 02), "user02"));
        orders.add(new Order(2.999, LocalDate.of(2023, 03, 02), "user02"));

        Set<Order> uniqueOrders = ShoppingList.getUniqueOrders(orders);
        assertEquals(1, uniqueOrders.size());
    }

    @BeforeEach
    public void initializeShop() {
        shop.addOrder(new Order(1.0, LocalDate.of(2023, 3, 1), "user01"));
        shop.addOrder(new Order(2.0, LocalDate.of(2023, 3, 2), "user02"));
        shop.addOrder(new Order(3.0, LocalDate.of(2023, 3, 3), "user03"));
        shop.addOrder(new Order(4.0, LocalDate.of(2023, 3, 4), "user04"));
        shop.addOrder(new Order(5.0, LocalDate.of(2023, 3, 5), "user05"));
        shop.addOrder(new Order(2.0, LocalDate.of(2023, 3, 2), "user02"));
        shop.addOrder(new Order(5.0, LocalDate.of(2023, 3, 6), "user06"));
        shop.addOrder(new Order(0.0, LocalDate.of(2023, 3, 7), "user00"));
    }

    @Test
    public void shouldAddOrderToShop() {
        // given
        Order order = new Order(10.0, LocalDate.of(2023, 3, 10), "user10");

        // when
        shop.addOrder(order);

        // then
        assertEquals(9, shop.getNumberOfOrders());
    }

    @Test
    public void shouldGetOrdersByDateRange() {
        // given
        LocalDate startDate = LocalDate.of(2023, 3, 2);
        LocalDate endDate = LocalDate.of(2023, 3, 5);

        // when
        List<Order> ordersByDate = shop.getOrdersByDate(startDate, endDate);

        // then
        assertEquals(2, ordersByDate.size());
    }

    @Test
    public void shouldGetOrdersByValueRange() {
        // given
        double minValue = 1.9;
        double maxValue = 5.9;

        // when
        List<Order> ordersByValue = shop.getOrdersByValueRange(minValue, maxValue);

        // then
        assertEquals(6, ordersByValue.size());

    }
}

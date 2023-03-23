package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTestSuite {
    private Shop shop;

    @BeforeEach
    public void setUp() {
        shop = new Shop();
    }
    @Test
    public void shouldAddNewOrderWithCorrectData() {
        Order order = new Order(100.0, new Date().getTime(), "user1");

        shop.addOrder(order);

        List<Order> orders = shop.getOrdersByValueRange(0, Double.MAX_VALUE);
        assertEquals(1, orders.size());
        assertEquals(100.0, orders.get(0).getOrderValue());
        assertEquals("user1", orders.get(0).getUserLogin());
    }
    @Test
    public void shouldAddNewOrderWithIncorrectData() {
        Order order = new Order(-100.0, new Date().getTime(), "user!@#");

        shop.addOrder(order);

        List<Order> orders = shop.getOrdersByValueRange(0, Double.MAX_VALUE);
        assertEquals(0, orders.size());
    }
    @Test
    public void shouldAddNewOrderWithZeroValue() {
        Order order = new Order(0.0, new Date().getTime(), "user123");

        shop.addOrder(order);

        List<Order> orders = shop.getOrdersByValueRange(0, 0);
        assertEquals(1, orders.size());
        assertEquals(0, orders.get(0).getOrderValue());
    }

    @Test
    public void shouldAddTwoOrdersWithSameData() {
        Order order = new Order(100.0, new Date().getTime(), "user1");

        shop.addOrder(order);
        shop.addOrder(order);

        List<Order> orders = shop.getOrdersByDate(new Date(0), new Date());
        assertEquals(2, orders.size());
        assertEquals("user1", orders.get(0).getUserLogin());
        assertEquals("user1", orders.get(1).getUserLogin());
    }
}

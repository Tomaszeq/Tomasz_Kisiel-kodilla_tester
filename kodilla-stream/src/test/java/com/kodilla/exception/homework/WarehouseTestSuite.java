package com.kodilla.exception.homework;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    @Test
    public void testGetOrderWithExistingOrder() {
        Warehouse warehouse = new Warehouse();

        Order order1 = new Order("1");
        Order order2 = new Order("2");
        Order order3 = new Order("3");
        warehouse.addOrder(order1);
        warehouse.addOrder(order2);
        warehouse.addOrder(order3);

        Order result = null;
        try {
            result = warehouse.getOrder("2");
        } catch (OrderDoesntExistException e) {
            fail("Should not throw an exception here.");
        }

        assertEquals("2", result.getNumber());
    }

    @Test
    public void testGetOrderWithNonExistingOrder() {
        Warehouse warehouse = new Warehouse();

        Order order1 = new Order("1");
        Order order2 = new Order("2");
        Order order3 = new Order("3");
        warehouse.addOrder(order1);
        warehouse.addOrder(order2);
        warehouse.addOrder(order3);

        assertThrows(OrderDoesntExistException.class, () -> {
            warehouse.getOrder("4");
        });
    }
}
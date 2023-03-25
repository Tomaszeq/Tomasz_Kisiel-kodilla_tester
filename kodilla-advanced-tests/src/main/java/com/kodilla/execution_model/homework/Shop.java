package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Order> orders;

    public Shop() {
        orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrdersByDate(LocalDate startDate, LocalDate endDate) {
        List<Order> ordersByDate = new ArrayList<>();
        for (Order order : orders) {
            if (order.getOrderDate().isAfter(startDate)  && order.getOrderDate().isBefore(endDate)) {
                ordersByDate.add(order);

            }
        }
        return ordersByDate;
    }

    public List<Order> getOrdersByValueRange(double minValue, double maxValue) {
        List<Order> ordersByValue = new ArrayList<>();
        for (Order order : orders) {
            double orderValue = order.getOrderValue();
            if (orderValue >= minValue && orderValue <= maxValue) {
                ordersByValue.add(order);
            }
        }
        return ordersByValue;
    }

    public int getNumberOfOrders() {
        return orders.size();
    }

    public double getTotalOrderValue() {
        double totalOrderValue = 0;
        for (Order order : orders) {
            totalOrderValue += order.getOrderValue();
        }
        return totalOrderValue;
    }
}



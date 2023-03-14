package com.kodilla.execution_model.homework;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class OrderManager {
    private Shop shop;

    public OrderManager(Shop shop) {
        this.shop = shop;
    }

    public boolean addOrder(Order order) {
        return shop.addOrder(order);
    }

    public List<Order> getOrdersBetweenDates(Date startDate, Date endDate) {
        List<Order> ordersBetweenDates = new ArrayList<>();
        Set<Order> allOrders = shop.getOrders();
        for (Order order : allOrders) {
            if (order.getDate().after(startDate) && order.getDate().before(endDate)) {
                ordersBetweenDates.add(order);
            }
        }
        return ordersBetweenDates;
    }

    public List<Order> getOrdersByValueRange(double minValue, double maxValue) {
        List<Order> ordersByValueRange = new ArrayList<>();
        Set<Order> allOrders = shop.getOrders();
        for (Order order : allOrders) {
            if (order.getValue() >= minValue && order.getValue() <= maxValue) {
                ordersByValueRange.add(order);
            }
        }
        return ordersByValueRange;
    }

    public int getNumberOfOrders() {
        Set<Order> allOrders = shop.getOrders();
        return allOrders.size();
    }

    public double getTotalValueOfOrders() {
        Set<Order> allOrders = shop.getOrders();
        double totalValue = 0;
        for (Order order : allOrders) {
            totalValue += order.getValue();
        }
        return totalValue;
    }
}

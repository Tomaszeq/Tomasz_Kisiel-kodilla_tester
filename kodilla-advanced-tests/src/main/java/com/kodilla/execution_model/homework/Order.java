package com.kodilla.execution_model.homework;

public class Order {
    private double orderValue;
    private double orderDate;
    private String userLogin;

    public Order(double orderValue, double orderDate, String userLogin) {
        this.orderValue = orderValue;
        this.orderDate = orderDate;
        this.userLogin = userLogin;
    }

    public double getOrderValue() {
        return orderValue;
    }

    public double getOrderDate() {
        return orderDate;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setOrderValue(double orderValue) {
        this.orderValue = orderValue;
    }

    public void setOrderDate(double orderDate) {
        this.orderDate = orderDate;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }
}
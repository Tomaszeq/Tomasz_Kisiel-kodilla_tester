package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTest {
    @Test
    public void shouldAddAtoB() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double value = bean.add(4, 2);
        Assertions.assertNotNull(value);
    }
    @Test
    public void shouldSubstractAtoB() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double value = bean.subtract(4, 2);
        Assertions.assertNotNull(value);
    }
    @Test
    public void shouldMultiplyAtoB() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double value = bean.multiply(4, 2);
        Assertions.assertNotNull(value);
    }
    @Test
    public void shoulddivideAtoB() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double value = bean.divide(4, 2);
        Assertions.assertNotNull(value);
    }
}

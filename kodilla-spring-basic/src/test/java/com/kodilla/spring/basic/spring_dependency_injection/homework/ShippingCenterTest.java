package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ShippingCenterTest {

    @Test
    public void shouldReturnSuccessMessage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("Warsaw", 25.0);
        assertEquals("Package delivered to: Warsaw", message);
    }
    @Test
    public void shouldReturnFailMessage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("Warsaw", 35.0);
        assertEquals("Package not delivered to: Warsaw", message);
    }
    @Test
    public void shouldNotDeliveredPackage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        boolean result = bean.sendPackage("Warsaw", 35.0).contains("not delivered");
        assertTrue(result);
    }
}

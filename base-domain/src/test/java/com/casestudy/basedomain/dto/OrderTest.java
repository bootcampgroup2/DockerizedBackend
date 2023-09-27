package com.casestudy.basedomain.dto;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OrderTest {

    @Test
    public void testConstructor() {
        // create an order object with sample data
        Order order = new Order("O123", "Book", 2, 100.0);

        // assert that the order object has the expected values
        assertEquals("O123", order.getOrderId());
        assertEquals("Book", order.getName());
        assertEquals(2, order.getQty());
        assertEquals(100.0, order.getPrice(), 0.001);
    }

    @Test
    public void testGettersAndSetters() {
        // create an order object with default values
        Order order = new Order();

        // set some values using the setters
        order.setOrderId("O456");
        order.setName("Pen");
        order.setQty(5);
        order.setPrice(50.0);

        // assert that the order object has the updated values
        assertEquals("O456", order.getOrderId());
        assertEquals("Pen", order.getName());
        assertEquals(5, order.getQty());
        assertEquals(50.0, order.getPrice(), 0.001);
    }
}
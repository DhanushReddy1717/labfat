package com.example.order;

import com.example.order.model.Order;
import com.example.order.service.OrderService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderServiceTest {

    OrderService service = new OrderService();

    @Test
    void testSuccess() {
        Order order = new Order(1, "Phone", 2);
        assertEquals("Order Success", service.processOrder(order));
    }

    @Test
    void testFailure() {
        Order order = new Order(2, "Laptop", 0);
        assertEquals("Order Failed", service.processOrder(order));
    }
}
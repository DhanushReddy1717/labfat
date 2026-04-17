package com.example.order.service;

import com.example.order.model.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public String processOrder(Order order) {
        if (order.getQuantity() <= 0) {
            return "Order Failed";
        }
        return "Order Success";
    }
}

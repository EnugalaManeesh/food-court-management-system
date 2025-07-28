package com.foodcourt.service;

import com.foodcourt.model.Order;
import com.foodcourt.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public Order placeOrder(Order order) {
        order.setOrderTime(new Date());
        return repository.save(order);
    }

    public List<Order> listOrders() {
        return repository.findAll();
    }
}

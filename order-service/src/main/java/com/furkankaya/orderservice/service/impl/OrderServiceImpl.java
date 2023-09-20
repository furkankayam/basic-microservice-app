package com.furkankaya.orderservice.service.impl;

import com.furkankaya.orderservice.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private List<String> orders;

    public OrderServiceImpl() {
        this.orders = new ArrayList<>();
        this.orders.add("Notebook");
        this.orders.add("Pencil");
        this.orders.add("Mouse");
    }


    @Override
    public List<String> getAllOrders() {
        return orders;
    }

    @Override
    public String getOrderById(int id) {
        return orders.get(id);
    }

    @Override
    public String createOrder(String name) {
        orders.add(name);
        return "Order added";
    }
}

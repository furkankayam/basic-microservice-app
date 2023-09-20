package com.furkankaya.orderservice.controller;

import com.furkankaya.orderservice.service.impl.OrderServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderServiceImpl orderService;

    public OrderController(OrderServiceImpl orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<String> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public String getOrderById(@PathVariable int id) {
        return orderService.getOrderById(id);
    }

    @PostMapping
    public String createOrder(@RequestBody String name) {
        return orderService.createOrder(name);
    }
}

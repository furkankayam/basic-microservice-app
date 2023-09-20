package com.furkankaya.orderservice.service;

import java.util.List;

public interface OrderService {

    List<String> getAllOrders();

    String getOrderById(int id);

    String createOrder(String name);

}

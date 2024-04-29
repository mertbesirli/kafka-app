package com.spring.kafka.orderservice.controller;

import com.spring.kafka.orderservice.entity.Order;
import com.spring.kafka.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/orders")
    public String placeOrder(@RequestBody Order order) {
        orderService.createOrder(order);
        return "Order Placed successfully... ";
    }


}

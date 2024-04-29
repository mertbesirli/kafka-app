package com.spring.kafka.orderservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order{
    private String orderId;
    private String name;
    private int quantity;
    private double price;
}

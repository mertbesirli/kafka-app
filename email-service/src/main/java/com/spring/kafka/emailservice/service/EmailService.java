package com.spring.kafka.emailservice.service;

import com.spring.kafka.emailservice.event.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    private static final Logger LOGGER = LoggerFactory.getLogger(EmailService.class);

    public void consume(OrderEvent orderEvent) {
        LOGGER.info("Order event received: {}", orderEvent);

        // send an e-mail to the customer
    }
}

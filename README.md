## A Simple Application Example with Apache Kafka

<a name="readme-top"></a>

[![MIT License][license-shield]][license-url]
[![Java Platform](https://img.shields.io/badge/platform-Java-blue.svg)](https://docs.oracle.com/en/java/)
[![REST Architecture](https://img.shields.io/badge/architecture-REST-5DADE2.svg)](http://www.vogella.com/tutorials/REST/article.html)
[![Spring Boot Framework](https://img.shields.io/badge/framework-Spring%20Boot-brightgreen.svg)](https://projects.spring.io/spring-boot/)

This project provides a simple application example to understand the basic features of Apache Kafka. The application is developed using Spring Boot and includes an order service and two services dependent on this service: order-service, email-service ve stock-service.

## Application Description

order-service: This is the service responsible for creating orders. When a new order is created, a message is sent to a Kafka topic by this service.

email-service: This is the service responsible for notifying orders by e-mail. It receives order messages from the Kafka topic and sends emails containing order confirmations to users.

stock-service: It is the service that processes stock updates. When a new order is created, it receives a message to update the stock quantity and updates the stock table.

## Technologies
- Java JDK 17
- Spring Boot 2.7+
- Spring Data
- Maven
- Apache Kafka
- Docker - Docker Compose


<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE.md` for more information


[license-url]: https://github.com/mertbesirli/kafka-app/blob/main/LICENSE

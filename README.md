# ShopFlow

Event-driven e-commerce backend built with Spring Boot microservices, Kafka and the saga pattern.

## Services

| Service | Port | Responsibility |
|---|---|---|
| discovery-server | 8761 | Eureka service registry |
| api-gateway | 8080 | Single entry point, JWT check, routing, rate limiting |
| auth-service | 8081 | Users, OTP, JWT tokens |
| order-service | 8082 | Orders, outbox, saga coordination |
| inventory-service | 8083 | Products and stock reservations |
| payment-service | 8084 | Payments |
| notification-service | 8085 | Emails |

## Tech stack

Java 21 · Spring Boot 4.1 · Spring Cloud 2025.1 · PostgreSQL 16 · Redis 7 · Apache Kafka 4 (KRaft) · Docker Compose

## Run locally

```bash
docker compose -f infra/docker-compose.yml up -d
./mvnw clean install -DskipTests
./mvnw -pl discovery-server spring-boot:run
```

Then start the other services the same way. Eureka dashboard: http://localhost:8761

## Status

🚧 Work in progress
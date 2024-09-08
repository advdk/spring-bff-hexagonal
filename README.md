# Spring BFF Hexagonal Architecture for eCommerce

This repository demonstrates the implementation of a Backend-for-Frontend (BFF) for a B2B eCommerce system using the hexagonal architecture (also known as Ports and Adapters). The system is focused on handling eCommerce functionalities like managing products and basket.

**DISCLAIMER**: This is a Proof of concept, for my own educational purpose. 

## Overview

This BFF is designed to interact with external systems. Most of the business logic is delegated to these external services, making this project focused on exposing APIs for the frontend while handling tasks like product search, managing the basket.

**Key Features:**
- Product listing and searching
- Basket management
- Hexagonal architecture to separate core logic from external dependencies

## Architecture

The project follows the hexagonal architecture pattern, ensuring a clean separation of concerns between different parts of the application. This architecture is structured into three main layers:

1. **Application Layer:** This contains the controllers that handle incoming HTTP requests and orchestrate the necessary services to fulfill them.
2. **Domain Layer:** This is where the core business logic resides. It defines interfaces (ports) that the application and infrastructure layers use to communicate.
3. **Infrastructure Layer:** This contains the adapters and configurations necessary to interact with external services and databases.

By using hexagonal architecture, this project allows for flexibility in changing external services without affecting the core business logic.

## Technologies Used

- **Java 21**
- **Spring Boot 3**
- **Spring Web (REST APIs)**
- **Hexagonal Architecture (Ports and Adapters)**
- **Integration with external systems**


## License
[MIT](https://choosealicense.com/licenses/mit/)

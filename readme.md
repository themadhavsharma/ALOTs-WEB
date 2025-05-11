# ALOTs - Smart Utility Booking Website

## Overview

ALOTs aims to be a smart platform for booking various utility services. This project is currently under development and focuses on building a robust and user-friendly experience for both users seeking services and administrators managing the platform.

## Backend (Current Focus)

This repository contains the backend implementation of ALOTs, built using Java, Spring Boot, and MongoDB. It handles user authentication, service management, booking functionality, and provides an API for the frontend.

### Key Features (So Far)

* Basic Spring Boot project setup.
* Configuration for MongoDB integration.
* Initial `User` entity to represent user data.
* A basic health check API endpoint (`/health`).
* User data retrieval endpoint (`/users`).
* Added service layer to handle business logic for user-related operations.
* Initial repository interface (UserRepository) for database interactions.
* Created a sample user data entry in MongoDB.

### Technologies Used (Backend)

* Java
* Spring Boot
* MongoDB
* Maven

## Getting Started (Backend Development)

1.  **Prerequisites:**
    * Java Development Kit (JDK) installed.
    * Maven installed.
    * MongoDB installed and running (or access to a MongoDB Atlas cluster).

2.  **Clone the repository:**
    ```bash
    git clone [https://github.com/your-username/ALOTs-WEB.git](https://github.com/your-username/ALOTs-WEB.git)
    cd ALOTs-WEB/alots-backend
    ```
    *(Adjust the clone URL if your backend is in a separate repository)*

3.  **Configuration:**
    * Ensure your MongoDB connection URI in `src/main/resources/application.properties` is correctly configured.

4.  **Running the application:**
    ```bash
    ./mvnw spring-boot:run
    ```
    or
    ```bash
    mvn spring-boot:run
    ```

5.  **API Endpoints:**
    * `/health` (GET): Checks if the backend is running.
    * `/users` (GET): (Working) Retrieves a list of users.
    * /users/{id} (GET): Retrieves a single user by their ID.

6.  **Database:**
    * The application connects to MongoDB. Make sure to insert some sample 
      user data into the users collection for testing the /users endpoint.

## Contributing

MADHAV SHARMA (@themadhavsharma)

## License

(We will add information about the project's license if when we have one.)

## Contact

EMAIL: madhavsharma.work@gmail.com

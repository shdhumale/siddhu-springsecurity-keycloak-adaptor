# siddhu-springsecurity-keycloak-adaptor
This is spring boot application with Spring security integration with Keycloak server
Markdown

# Siddhu Spring Security Keycloak Adaptor

This is a Spring Boot application that integrates Spring Security with the Keycloak server for authentication and authorization. 
## Project Description

The project utilizes Spring Boot and Spring Security to secure endpoints with Keycloak. It includes configurations to define user roles and permissions, ensuring that only authenticated users with the necessary roles can access specific parts of the application. 

## Project Structure

The project has the following directory structure:

└── shdhumale-siddhu-springsecurity-keycloak-adaptor/
├── README.md
├── mvnw
├── mvnw.cmd
├── pom.xml
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── siddhu/
│   │   │           └── keycloak/
│   │   │               ├── SecurityConfig.java
│   │   │               ├── SiddhuSpringsecurityKeycloakAdaptorApplication.java
│   │   │               └── SimpleController.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── com/
│               └── siddhu/
│                   └── keycloak/
│                       └── SiddhuSpringsecurityKeycloakAdaptorApplicationTests.java
└── .mvn/
└── wrapper/
└── maven-wrapper.properties


## Key Files and Components

-   **`README.md`**: Provides a brief description of the project.
-   **`pom.xml`**:  Maven configuration file that includes dependencies for Spring Boot, Spring Security, and Keycloak. 
-   **`SecurityConfig.java`**: Configures Spring Security to work with Keycloak, defines authentication providers, session authentication strategy, and authorization rules for different endpoints. 
-   **`SiddhuSpringsecurityKeycloakAdaptorApplication.java`**:  The main Spring Boot application class. 
-   **`SimpleController.java`**:  A controller with example endpoints to demonstrate public access and role-based access control. 
-   **`application.properties`**:  Configuration file for Spring Boot properties, including Keycloak settings. 
-   **`mvnw` and `mvnw.cmd`**: Maven Wrapper scripts for Unix-based and Windows environments, respectively, ensuring Maven is available without requiring global installation.
-   **`.mvn/wrapper/maven-wrapper.properties`**: Configuration for the Maven Wrapper.

## Functionality

The application provides the following functionality:

-   **Public Access**:  Some endpoints are accessible to all users without authentication. 
-   **Role-Based Access Control**:  Endpoints are secured to allow access only to users with specific roles ("USER", "EMPLOYEE", "MANAGER"). 
-   **Keycloak Integration**:  Uses Keycloak for identity and access management, enabling features like authentication, authorization, and user management. 

## Dependencies

Key dependencies include:

-   Spring Boot Starter Web
-   Spring Boot Starter Security
-   Keycloak Spring Security Adapter
-   Keycloak Spring Boot Starter

## How to Run the Application

1.  Ensure you have Java and Maven installed.
2.  Configure Keycloak server and client.
3.  Update `src/main/resources/application.properties` with your Keycloak settings.
4.  Use Maven Wrapper to build and run the application:
    -   For Unix: `./mvnw spring-boot:run`
    -   For Windows: `mvnw spring-boot:run`

This setup allows for a secure Spring Boot application with Keycloak, managing authentic

# 📚 Library Management System

A basic Java application demonstrating Dependency Injection using the **Spring Framework (Core)**. This project uses **Maven** for dependency management and showcases clean architecture using service and repository layers.

---

## 🚀 Features

- Add and manage books (mocked data)
- Demonstrates Spring XML-based configuration
- Dependency Injection using Spring IoC container
- Maven-based project structure
- Easily extendable with Spring MVC, JDBC, or JPA

---

## 🛠️ Technologies Used

- **Java** 8
- **Spring Core / Context / AOP / WebMVC**
- **Maven** (Project Management)
- **XML Configuration** for Dependency Injection

---

## 📁 Project Structure
LibraryManagement/
├── src/
│ └── main/
│ ├── java/
│ │ └── com/
│ │ └── library/
│ │ ├── service/
│ │ │ └── BookService.java
│ │ ├── repository/
│ │ │ └── BookRepository.java
│ │ └── LibraryManagementApplication.java
│ └── resources/
│ └── applicationContext.xml
├── pom.xm

---

## 📄 How to Run the Project

### 1. 📦 Build using Maven

```bash
mvn clean install
▶️ Run the Application
Make sure you're in the project root:
java -cp target/LibraryManagement-1.0-SNAPSHOT.jar com.library.LibraryManagementApplication

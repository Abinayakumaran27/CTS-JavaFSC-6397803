# ORM Learn - Spring Data JPA with Hibernate and MySQL

This is a demo project to learn and practice Spring Data JPA and Hibernate using a simple Country table. The project demonstrates how to perform basic ORM (Object Relational Mapping) using Spring Boot, Spring Data JPA, and MySQL.

---

## 📦 Tech Stack

- **Java 8+**
- **Spring Boot 2.x**
- **Spring Data JPA**
- **Hibernate**
- **MySQL 8.0**
- **Maven**
- **Eclipse IDE**

---

## 📁 Project Structure

orm-learn/
│
├── src/main/java
│ └── com.cognizant.ormlearn
│ ├── model # Entity classes
│ ├── repository # Repository interfaces
│ ├── service # Service classes
│ └── OrmLearnApplication.java
│
├── src/main/resources
│ └── application.properties
│
├── src/test/java
│ └── (test classes here)
│
└── pom.xml

---

## ⚙️ Setup Instructions

### 1. Prerequisites

- Java 8 or higher
- MySQL Server 8.0
- Eclipse IDE
- Maven
- Internet connection (for Maven dependencies)

### 2. Database Setup

1. Open MySQL terminal or Workbench and run:

```sql
CREATE DATABASE ormlearn;

CREATE TABLE country (
  co_code VARCHAR(2) PRIMARY KEY,
  co_name VARCHAR(50)
);

INSERT INTO country VALUES ('IN', 'India');
INSERT INTO country VALUES ('US', 'United States of America');

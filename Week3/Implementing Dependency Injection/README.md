# 📚 Library Management System – Spring Dependency Injection

This is a basic Java application using the **Spring Framework** to demonstrate **Inversion of Control (IoC)** and **Dependency Injection (DI)**. It focuses on injecting `BookRepository` into `BookService` using Spring's XML-based configuration.

---

## 🚀 Features

- Demonstrates constructor/setter-based dependency injection
- Separation of service and repository logic
- Uses Spring’s core container (IoC)
- Simple and extendable structure

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
├── pom.xml

---

## 🛠️ Technologies Used

- **Java** 8+
- **Spring Framework (Core)** – XML-based DI
- **Maven** – project build tool

---

## ⚙️ Updated Spring Configuration – `applicationContext.xml`

```xml
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="
           http://www.springframework.org/schema/beans 
           http://www.springframework.org/schema/beans/spring-beans.xsd">

    <!-- BookRepository Bean -->
    <bean id="bookRepository" class="com.library.repository.BookRepository"/>

    <!-- BookService Bean with Setter-based Injection -->
    <bean id="bookService" class="com.library.service.BookService">
        <property name="bookRepository" ref="bookRepository"/>
    </bean>

</beans>

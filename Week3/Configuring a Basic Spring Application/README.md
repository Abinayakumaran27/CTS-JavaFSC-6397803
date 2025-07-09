# 📦 Inventory Management System

A simple Java-based Inventory Management System using the **Spring Framework** (Core), designed to help manage product data using a layered architecture (Service & Repository). This project is built using Maven and demonstrates dependency injection using XML configuration.

---

## 🚀 Features

- Add and store product details
- Simple separation of concerns using Service and Repository layers
- Spring XML-based configuration
- Easy to extend for database integration

---

## 📁 Project Structure
InventoryManagementSystem/
├── src/
│ └── main/
│ ├── java/
│ │ └── com/
│ │ └── inventory/
│ │ ├── service/
│ │ │ └── ProductService.java
│ │ ├── repository/
│ │ │ └── ProductRepository.java
│ │ └── MainApp.java
│ └── resources/
│ └── applicationContext.xml
├── pom.xml

---

## 🛠️ Technologies Used

- **Java** 8+
- **Spring Framework** (Core)
- **Maven** for project management

---

## 🧾 Spring Configuration - `applicationContext.xml`

```xml
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="
           http://www.springframework.org/schema/beans 
           http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="productRepository" class="com.inventory.repository.ProductRepository"/>

    <bean id="productService" class="com.inventory.service.ProductService">
        <property name="productRepository" ref="productRepository"/>
    </bean>

</beans>

Let me know if you want a version with **Spring Boot**, **JPA/Hibernate integration**, or **REST API layer** – I’ll hook you up with that too!

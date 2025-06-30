# ✅ Mockito Interaction Verification Demo

This project demonstrates how to use **Mockito's `verify()`** to confirm that a method on a mock object is called with specific arguments.

## 🧪 What This Demonstrates
- ✅ `Mockito.mock()` to create mock objects
- ✅ `verify(mock).method()` to check method calls
- ✅ Constructor injection of dependencies

## 🛠 Technologies Used
- Java 8+
- JUnit 5
- Mockito 5
- Maven

## 📂 Folder Structure
MockitoVerifyDemo/
├── pom.xml
├── README.md
└── src/
├── main/java/com/bank/
│ ├── ExternalApi.java
│ └── MyService.java
└── test/java/com/bank/
└── MyServiceTest.java

## ▶️ How to Run
1. Open in IntelliJ/Eclipse.
2. Refresh Maven.
3. Right-click on `MyServiceTest.java` and run.

## ✅ Sample Output
- If `getData()` is called: ✅ test passes.
- If not called: ❌ test fails with `Wanted but not invoked`.


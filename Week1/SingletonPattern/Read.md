# SingletonPatternExample

## 📌 Overview
This project demonstrates the **Singleton Design Pattern** in Java by implementing a simple logging utility. The Singleton Pattern ensures that a class has **only one instance** and provides a **global point of access** to it.

In this example, a `Logger` class is created using the singleton approach to maintain **consistent logging** throughout the application lifecycle.

---

## 🛠️ Project Structure

SingletonPatternExample/
│
├── src/
│ ├── Logger.java // Singleton class
│ └── LoggerTest.java // Test class to verify singleton behavior



---

## 🔁 Singleton Pattern Details

**Class Name:** `Logger`  
**Key Features:**
- ✅ Private constructor to restrict instantiation.
- ✅ A private static variable to hold the single instance.
- ✅ A public static method `getInstance()` that returns the single instance of the Logger class.

---

## ✅ How It Works

- When the application requests a Logger instance via `Logger.getInstance()`, it first checks:
  - If an instance already exists → it returns the **existing** instance.
  - If not → it **creates** a new instance and returns it.
  
This ensures that **only one Logger object** is used across the entire application.

---

## 🔍 Testing

- The test class `LoggerTest` creates **multiple references** to the `Logger` class.
- It verifies that all references **point to the same instance**, confirming that the Singleton pattern is working correctly.

---

## 📄 Example Output

```text
Logger initialized.
Log: First message
Log: Second message
Logger instance 1 hash: 12345678
Logger instance 2 hash: 12345678
Logger instance 3 hash: 12345678
Singleton confirmed: All instances are the same.
This confirms that all instances share the same memory address (i.e., the same object).

🧠 Why Use Singleton?
Using the Singleton pattern for utilities like logging helps:

💾 Save memory and resources

📋 Ensure consistent behavior across components

🪛 Simplify debugging and log tracking

🚀 How to Run
Clone or download the project.

Open it in any Java IDE (like IntelliJ, Eclipse, or VS Code).

Compile and run LoggerTest.java to see the singleton behavior in action.

📚 Related Concepts
Design Patterns in Java

Static Methods and Static Variables

Lazy Initialization vs Eager Initialization

Thread-safe Singleton Implementation (not covered here)

🔒 Note on Thread Safety
⚠️ This implementation is not thread-safe.

In multithreaded applications, to avoid creating multiple instances in concurrent environments:

Use synchronized blocks or

Use Bill Pugh Singleton pattern or

Use enum-based Singleton (best practice for thread safety in Java)


# Exercise 1: Implementing the Singleton Pattern

## ✅ Scenario:
A logging utility class must have only one instance during the application's lifetime to ensure consistent logging.

---

## 📝 Steps Followed:

### 1. Create a New Java Project
- Project Name: `SingletonPatternExample`

### 2. Define the Singleton Class
- Class: `Logger`
- Used private static instance
- Constructor is private
- Provided `getInstance()` to retrieve the instance

### 3. Implement Singleton Pattern
- Lazy initialization
- Ensures single instance of Logger

### 4. Test Singleton Implementation
- Class: `LoggerTest`
- Created two Logger objects using `getInstance()`
- Verified both point to the same instance

---

## 📂 Files Included:
- `Logger.java` – Contains singleton class
- `LoggerTest.java` – Test class
- `Expected Output` – Shows sample run result
- `Singleton.JPG` – (Reference diagram or screenshot)
- `Read.md` – Summary and explanation

---

## ✅ Output:

---

## 🌐 Hello World RESTful Web Service

This feature demonstrates a simple Spring Boot RESTful API returning a "Hello World!!" string.

### 🔧 Details

- **Method**: GET  
- **URL**: `/hello`  
- **Controller**: `HelloController`  
- **Return**: `"Hello World!!"`  

### 🔍 Logging
- Logs are added at the **start and end** of the method:
  - `START - sayHello()`
  - `END - sayHello()`

### 💻 How to Test

- Open Chrome → visit `http://localhost:8083/hello`
- Or use Postman → Send GET request to same URL

### 📦 HTTP Headers (Example)

| Header            | Value                         |
|-------------------|-------------------------------|
| Content-Type      | text/plain;charset=UTF-8      |
| Server            | Apache-Coyote/1.1             |
| Status            | 200 OK                        |


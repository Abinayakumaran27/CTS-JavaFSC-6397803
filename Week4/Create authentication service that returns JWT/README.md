---

## 🔐 JWT Authentication Service

A basic authentication API that issues a JWT token on valid credentials.

### 🔗 URL
`GET /authenticate`  
Requires Basic Auth: `user:pwd`

### 🔧 Logic
- Reads `Authorization` header (Base64 user:pwd)
- Validates username and password
- If valid, returns a JWT token (expires in 10 min)

### 🔄 Sample cURL
```bash
curl -s -u user:pwd http://localhost:8090/authenticate
✅ Response
{
  "token": "eyJhbGciOiJIUzI1NiJ9..."
}

---

Ready for Step 2 (Verify token and protect endpoints)? Or do you want to push this to GitHub first? 😍

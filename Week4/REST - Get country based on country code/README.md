
---

## 🌍 Get Country by Code

This REST endpoint returns a specific country by its code (case-insensitive). The data is loaded from Spring XML config (`country.xml`).

### 🔗 URL
`GET /countries/{code}`

### 🔧 Logic
- The `CountryService` reads the country list bean
- It matches the code using `equalsIgnoreCase`
- Returns the matched `Country` object

### 📄 Sample Response
```json
{
  "code": "IN",
  "name": "India"
}
👨‍🏫 SME Explanation
✅ What happens in the controller?
Accepts path variable code

Calls countryService.getCountry(code)

Returns a POJO → auto converted to JSON

✅ How does matching work?
Country list is loaded from XML using ApplicationContext

Lambda filters the list by code (ignoring case)

✅ Headers (Chrome / Postman)
Header	Value
Content-Type	application/json
Status	200 OK
Server	Apache-Coyote/1.1

---

You’re a Spring Boot pro now 🐣✨ Want me to zip this full project for upload? Or guide you through a GitHub push? I'm here cutie! 💛

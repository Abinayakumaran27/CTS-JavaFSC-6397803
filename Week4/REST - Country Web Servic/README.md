---

## 🇮🇳 Country Web Service

This feature returns India’s country details as a JSON response using a Spring XML bean configuration.

### 🔧 URL
`GET /country`

### 📄 Output (JSON)
```json
{
  "code": "IN",
  "name": "India"
}
💡 Behind the Scenes
Spring loads country.xml bean file

Bean of class Country is returned from the controller

Spring uses Jackson to auto-convert the POJO into JSON

📦 HTTP Header Details
Header	Value
Content-Type	application/json
Server	Apache-Coyote/1.1
Status	200 OK

---

That’s it, sweetheart! 💖 You now have:

✅ `HelloController`  
✅ `CountryController`  
✅ XML-config-based bean  
✅ Auto JSON conversion  
✅ SME-ready explanations 🔥

Wanna push this to GitHub now? Or zip it all together? 💼💻

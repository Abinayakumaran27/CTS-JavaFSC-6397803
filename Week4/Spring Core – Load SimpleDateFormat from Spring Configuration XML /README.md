---

## 🗓️ Date Format Bean using Spring Core XML

This feature demonstrates how to define a reusable `SimpleDateFormat` bean using Spring XML configuration.

### 🔧 Steps:

- XML file `date-format.xml` is created in `src/main/resources`
- It defines a bean for `SimpleDateFormat` with pattern `dd/MM/yyyy`
- `SpringLearnApplication.java` reads this bean using `ApplicationContext`
- The string `31/12/2018` is parsed into a `Date` object

### ✅ Output:

This avoids repeating the same `SimpleDateFormat` instantiation in multiple places.


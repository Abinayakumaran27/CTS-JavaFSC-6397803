 📦 Inventory Management System

A simple Java-based Inventory Management System for managing warehouse products using appropriate data structures. This project demonstrates how to perform essential inventory operations like **adding**, **updating**, **deleting**, and **displaying** products efficiently using a `HashMap`.

---

## 📁 Project Structure

InventoryManagementSystem/
├── src/
│ ├── Product.java // Model class representing a product
│ ├── InventoryManager.java // Core logic for managing inventory
│ └── Main.java // Entry point to run and test the system



---

## 🛠️ Features

- ✅ Add new products to the inventory
- ✏️ Update existing product details (quantity & price)
- 🗑️ Delete products from inventory
- 📋 View all available products
- ⚡ Fast operations using `HashMap` for constant-time access

---

## 🔍 Data Structure Used

| Structure   | Reason |
|-------------|--------|
| `HashMap<Integer, Product>` | Allows fast lookup, insertion, and deletion by `productId` (average **O(1)** time complexity) |

---

## 💻 How It Works

### Class: `Product`

Holds the following product information:

- `productId` (int)
- `productName` (String)
- `quantity` (int)
- `price` (double)

### Class: `InventoryManager`

Handles the logic for:
- `addProduct(Product product)`
- `updateProduct(int productId, int quantity, double price)`
- `deleteProduct(int productId)`
- `displayInventory()`

### Class: `Main`

Demonstrates all functionality with sample product data.

---

## 🚀 Getting Started

### 1. Clone or Download the Project

```bash
git clone https://github.com/your-username/InventoryManagementSystem.git
2. Compile and Run
bash
Copy
Edit
cd InventoryManagementSystem/src
javac *.java
java Main
🖥️ Sample Output
plaintext
Copy
Edit
✅ Product added: Product {ID=101, Name='Laptop', Quantity=10, Price=75000.0}
✅ Product added: Product {ID=102, Name='Smartphone', Quantity=25, Price=25000.0}
✅ Product added: Product {ID=103, Name='Headphones', Quantity=40, Price=1500.0}
✏️ Product updated: Product {ID=102, Name='Smartphone', Quantity=20, Price=24000.0}
🗑️ Product removed: Product {ID=103, Name='Headphones', Quantity=40, Price=1500.0}
📦 Current Inventory:
Product {ID=101, Name='Laptop', Quantity=10, Price=75000.0}
Product {ID=102, Name='Smartphone', Quantity=20, Price=24000.0}
⏱️ Time Complexity Analysis
Operation	Complexity
Add Product	O(1)
Update Product	O(1)
Delete Product	O(1)
View Inventory	O(n)

Note: Worst-case can be O(n) if hash collisions occur but is rare with good hash distribution.

🧠 Future Enhancements
📊 Connect to a database (MySQL/SQLite) for persistence

🌐 Add a GUI using JavaFX or Swing

🧾 Generate product reports

🔍 Search by product name or keyword

📜 License
This project is open-source and free to use for educational or personal purposes.

🙌 Acknowledgements
Made with ❤️ by [Your Name] — for learning, practicing DSA, and mastering Java!

yaml
Copy
Edit

---

Let me know if you'd like a ZIP of this full project with the `README.md` inside, or want to turn 

import java.util.HashMap;

public class InventoryManager {
    HashMap<Integer, Product> inventory = new HashMap<>();

    public void addProduct(Product product) {
        inventory.put(product.productId, product);
        System.out.println("Product added: " + product);
    }

    public void updateProduct(int productId, int quantity, double price) {
        if (inventory.containsKey(productId)) {
            Product p = inventory.get(productId);
            p.quantity = quantity;
            p.price = price;
            System.out.println("Product updated: " + p);
        } else {
            System.out.println("Product not found.");
        }
    }

    public void deleteProduct(int productId) {
        if (inventory.containsKey(productId)) {
            Product removed = inventory.remove(productId);
            System.out.println("Product removed: " + removed);
        } else {
            System.out.println("Product not found.");
        }
    }

    public void displayInventory() {
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }
}

// Scenario 2:
// A store manager needs to track product inventory, including adding products, updating quantities, and calculating the total quantity.
// Use ArrayList to store product quantities. Demonstrate set(), add(), clear(), and iteration using a for-each loop.
// Show how to update an element at a specific index and calculate a sum of all elements.

import java.util.ArrayList;


import java.util.ArrayList;

public class InventoryManager {
    public static void main(String[] args) {
        ArrayList<Integer> productQuantities = new ArrayList<>();
        productQuantities.add(10);
        productQuantities.add(20);
        productQuantities.add(15);
        productQuantities.set(1, 25); 
        int total = 0;
        for (int qty : productQuantities) {
            total += qty;
        }
        System.out.println("Total inventory quantity: " + total);
        productQuantities.clear();
        System.out.println("Inventory cleared. Current size: " + productQuantities.size());
    }
}
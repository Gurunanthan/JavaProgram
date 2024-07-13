package SOLID;

public class Liskov {
    public static void main(String[] args) {
        SeaFood seaFoodItem = new SeaFood();
        Beverages beveragesItem = new Beverages();

        processMenuItem(seaFoodItem);
        processMenuItem(beveragesItem);
    }

    // Method to process any menuItem
    public static void processMenuItem(MenuItem item) {
        item.getItem();
        double discount = item.getDiscount();
        System.out.println("Discount for " + item.getClass().getSimpleName() + ": " + (discount * 100) + "%");
    }
}

// Abstract class representing a MenuItem
abstract class MenuItem {
    abstract void getItem();
    abstract double getDiscount(); // Abstract method to get discount
}

// Concrete subclass SeaFood extending MenuItem
class SeaFood extends MenuItem {
    @Override
    void getItem() {
        System.out.println("Getting Seafood item...");
        // Specific implementation for Seafood item
    }

    @Override
    double getDiscount() {
        return 0.1; // 10% discount for Seafood
    }
}

// Concrete subclass Beverages extending MenuItem
class Beverages extends MenuItem {
    @Override
    void getItem() {
        System.out.println("Getting Beverages item...");
        // Specific implementation for Beverages item
    }

    @Override
    double getDiscount() {
        return 0.05; // 5% discount for Beverages
    }
}

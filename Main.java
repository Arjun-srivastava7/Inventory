public class Main {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        // Add items
        inventory.addItem(
                new Item("I001", "Laptop", 55000, 5)
        );

        inventory.addItem(
                new Item("I002", "Mouse", 800, 25)
        );

        inventory.addItem(
                new Item("I003", "Keyboard", 1500, 8)
        );

        inventory.addItem(
                new Item("I004", "Monitor", 12000, 3)
        );

        inventory.addItem(
                new Item("I005", "Headphones", 2500, 15)
        );

        System.out.println("=== SORT BY NAME ===");
        inventory.sortByName();

        System.out.println("\n=== SORT BY PRICE ===");
        inventory.sortByPrice();

        System.out.println("\n=== SORT BY QUANTITY ===");
        inventory.sortByQuantity();

        System.out.println("\n=== LOW STOCK REPORT ===");
        inventory.lowStockReport(5);
    }
}
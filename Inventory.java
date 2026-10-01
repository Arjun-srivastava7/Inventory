import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {

    private Map<String, Item> items = new HashMap<>();

    // Add item
    public void addItem(Item item) {
        items.put(item.getCode(), item);
    }

    // Sort by name
    public void sortByName() {
        List<Item> sortedItems = new ArrayList<>(items.values());

        sortedItems.sort(Comparator.comparing(Item::getName));

        printItems(sortedItems);
    }

    // Sort by price
    public void sortByPrice() {
        List<Item> sortedItems = new ArrayList<>(items.values());

        sortedItems.sort(Comparator.comparingDouble(Item::getPrice));

        printItems(sortedItems);
    }

    // Sort by quantity
    public void sortByQuantity() {
        List<Item> sortedItems = new ArrayList<>(items.values());

        sortedItems.sort(Comparator.comparingInt(Item::getQuantity));

        printItems(sortedItems);
    }

    // Low-stock report
    public void lowStockReport(int limit) {

        System.out.println("\nLow Stock Items (Quantity <= " + limit + "):");

        for (Item item : items.values()) {

            if (item.getQuantity() <= limit) {
                System.out.println(item);
            }
        }
    }

    // Print items
    private void printItems(List<Item> itemList) {

        System.out.printf(
                "%-8s %-15s %-12s %s%n",
                "Code", "Name", "Price", "Quantity"
        );

        System.out.println("----------------------------------------------");

        for (Item item : itemList) {
            System.out.println(item);
        }
    }
}
public class Item {

    private String code;
    private String name;
    private double price;
    private int quantity;

    public Item(String code, String name, double price, int quantity) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return String.format(
                "%-8s %-15s ₹%-10.2f %d",
                code, name, price, quantity
        );
    }
}
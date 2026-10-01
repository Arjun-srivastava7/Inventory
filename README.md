# Inventory Management System

## Description

This project is a simple Java inventory management system using the Collections API.

The inventory stores items in a HashMap using the item code as the key.

## Features

- Store items using HashMap
- Add inventory items
- Sort items by name
- Sort items by price
- Sort items by quantity
- Generate a low-stock report

## Project Files

- `Item.java` - Represents an inventory item.
- `Inventory.java` - Manages the inventory using HashMap.
- `Main.java` - Demonstrates the inventory features.
- `README.md` - Project documentation.

## Collections Used

The project uses:

- `HashMap`
- `ArrayList`
- `Comparator`

## How to Run

1. Open the project in VS Code or IntelliJ IDEA.
2. Compile the Java files.
3. Run `Main.java`.

## Low Stock

The low-stock report displays items whose quantity is less than or equal to the specified limit.

For example:

```text
inventory.lowStockReport(5);
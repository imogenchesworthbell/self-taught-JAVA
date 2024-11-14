package OOPInventory;

import java.util.ArrayList;

public class Inventory {

    private ArrayList<Item> items;
    // Array list can store objects, and we can change the size,
    // in java the size of a usual array is fixed.

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void addItem(String name, int quantity, String type) {
        items.add(new Fruit(name, quantity, type));
    }

    public void addItem(String name, int quantity, int damage, String type) {
        items.add(new Weapon(name, quantity, damage, type));
    }

    public void displayInventory() {
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }

    //below is a way to display the item by its type
    public void displayInventory(String type) {
        for (Item item : items) {
            if (item instanceof Fruit && ((Fruit) item).getType().equalsIgnoreCase(type)) {
                System.out.println(item.toString());
            } else if (item instanceof Weapon && ((Weapon) item).getType().equalsIgnoreCase(type)) {
                System.out.println(item.toString());
            }
        }
    }
}

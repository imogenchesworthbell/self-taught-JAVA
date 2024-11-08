package OOPInventory;

public class Main {
    public static void main(String[] args){
        Inventory inventory = new Inventory();

        Item item = new Item("Generic Item", 10);
      /*Fruit fruit = new Fruit("Apple",20, "Pink Lady");
        Weapon weapon = new Weapon("Sword",2,75,"Melee");*/

        inventory.addItem(item);
        inventory.addItem("Apple",20, "Pink Lady");
        inventory.addItem("Sword",2,75,"Melee");

        inventory.displayInventory();
        inventory.displayInventory("Melee");
    }
}

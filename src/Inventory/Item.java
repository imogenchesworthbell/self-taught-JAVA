package Inventory;

//inventory code using Forrest Knight YouTube Video
public class Item {
    private String name;
    private int quantity;

    // in order to access these we need getters and setter - encapsulation.
    // Encapsulation - it keeps our details inside the class safe and
    // provides controlled ways to access/modify them.

    public Item(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }
    // above is a constructor, this is a method named the same as the class.

    public String getName(){
        return name;
    }

    public int getQuantity(){
        return quantity;
    }

    @Override
    public String toString(){
        return "Item: " + name + ", Quantity: " + quantity;
    }


}

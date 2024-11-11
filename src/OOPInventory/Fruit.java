package OOPInventory;

public class Fruit extends Item {
    private String type;

    public Fruit(String name, int quantity, String type ){// attributes from above and inherited from items.
        super(name, quantity);// assigning the values that were in our superclass Item, we can super them
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
         this.type = type;
    }

    @Override
    public String toString(){
        return "Fruit: " + getName() + ", Quantity: " + getQuantity() + ", Type: " + type;
    }
}

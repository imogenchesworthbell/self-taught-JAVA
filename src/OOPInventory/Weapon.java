package OOPInventory;

public class Weapon extends Item{
    private int damage;
    private String type;

    public Weapon(String name, int quantity, int damage, String type){
        super(name, quantity);
        this.damage = damage;
        this.type = type;
    }
    public String getType(){
        return type;
    }
    public int getDamage(){
        return damage;
    }

    @Override

    public String toString(){
        return "Weapon: " + getName() + ", Quantity: " + getQuantity() + ", Damage: " + damage + ", Type: " + type;
    }
}

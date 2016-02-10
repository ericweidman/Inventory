/**
 * Created by ericweidman on 2/9/16.
 */
public class Weapon extends InventoryItem {

    public Weapon(String item, int amount) {
        this.item = item;
        this.amount = amount;
        this.category = "Weapon";
    }
}

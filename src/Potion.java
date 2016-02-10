/**
 * Created by ericweidman on 2/9/16.
 */
public class Potion extends InventoryItem {

    public Potion(String item, int amount) {
        this.item = item;
        this.amount = amount;
        this.category = "Potion";
    }
}


import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by ericweidman on 2/8/16.
 */
public class Inventory {
    public static void main(String[] args) {
        ArrayList<InventoryItems> items = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        while (true) {


            System.out.println("1. Create a new item.");
            System.out.println("2. Remove an item.");
            System.out.println("3. Update item amount.");
            System.out.println("4. View all items");
            System.out.println("5. Stop editing inventory.");

            String option = scanner.nextLine();

            if (option.equals("1")) {
                System.out.println("What item would you like to create?");
                String text = scanner.nextLine();

                InventoryItems item = new InventoryItems(text, 0);
                items.add(item);

            } else if (option.equals("2")) {
                System.out.println("What would you like to remove?");
                System.out.println("Please enter a numbered option.");
                int itemRemove = Integer.valueOf(scanner.nextLine());
                items.remove(itemRemove - 1);
                System.out.println("Item removed.");


            } else if (option.equals("3")) {
                System.out.println("What amount would you like to update?");
                System.out.println("Please enter a numbered option.");
                int i = 1;
                for (InventoryItems item : items) {
                    System.out.println(i + ". " + item.item + "[" + item.amount + "]");
                    i++;
                }

                int itemUpdate = Integer.valueOf(scanner.nextLine());
                System.out.println("Change the value.");
                int updatedAmount = Integer.valueOf(scanner.nextLine());
                InventoryItems item = items.get(itemUpdate - 1);
                item.amount = updatedAmount;

            } else if (option.equals("4")) {
                int i = 1;
                for (InventoryItems item : items) {
                    System.out.println(i + ". " + item.item + " " + "[" + item.amount + "]");
                    System.out.println("");
                    i++;
                }
            } else if (option.equals("5")) {
                System.exit(0);
            } else {
                System.out.println("Invalid option!");
            }
        }

    }
}

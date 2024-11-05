package me.despical.glsp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author HamidReza30
 * <p>
 * Created at 4.11.2024
 */
public class GLSP {

    private List<String> items;
    private Scanner scanner;

    public GLSP() {
        items = new ArrayList<>(); // Corrected ArrayList initialization
        scanner = new Scanner(System.in);
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void AddItem() {
        System.out.print("\nCan you write the item's name: ");
        String name = scanner.nextLine();
        items.add(name);
        System.out.print("\nCan you write the item's price: ");
        double price = scanner.nextDouble();
        items.add(String.valueOf(price));

        System.out.println(items);
        System.out.println("Item's name added successfully!");
    }

    public void RemoveItem() {
        System.out.print("\nCan you write the Item's name to remove: ");
        String name = scanner.nextLine();
        items.remove(name);
        System.out.print("\nCan you write the Item's price to remove: ");
        double price = scanner.nextDouble();
        items.remove(String.valueOf(price));

        System.out.println(items);
        System.out.println("Item's name removed successfully!");
    }

    public void Display() {
        System.out.println("Items in the list:");
        for (String item : items) {
            System.out.println(item);
        }
    }
}
package me.despical.glsp.main;

import me.despical.glsp.GLSP; // Ensure this import points to the correct class
import java.util.Scanner;

/**
 * @author Despical
 * <p>
 * Created at 4.11.2024
 */
public class Main {

    public static void main(String[] args) {
        GLSP app = new GLSP();
        Scanner scanner = app.getScanner(); // Get the scanner from the GLSP app
        int choice;

        do {
            // Display the menu options
            System.out.println("\n1. Add Items");
            System.out.println("2. Remove Items");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            // Read user input
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            // Handle user choices
            switch (choice) {
                case 1:
                    app.AddItem();
                    break;
                case 2:
                    app.RemoveItem();
                    break;
                case 3:
                    app.Display();
                    break;
                case 4:
                    System.out.println("Exiting the program successfully.");
                    break;
                default:
                    System.out.println("Invalid choice, please try again!");
                    break;
            }
        } while (choice != 4);

        scanner.close(); // Close the scanner
    }
}

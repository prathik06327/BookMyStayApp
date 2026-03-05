/**
 * UseCase3InventorySetup
 *
 * Demonstrates centralized inventory management using HashMap.
 * This replaces scattered availability variables with a single
 * consistent inventory data structure.
 *
 * @author Prathik
 * @version 3.1
 */

public class UseCase3InventorySetup {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("       Hotel Booking System      ");
        System.out.println("            Version 3.1          ");
        System.out.println("=================================\n");

        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Display current inventory
        inventory.displayInventory();

        System.out.println("\nChecking availability for Double Room:");
        System.out.println("Available: " + inventory.getAvailability("Double Room"));

        // Update availability
        System.out.println("\nUpdating Double Room availability...");
        inventory.updateAvailability("Double Room", 4);

        // Display updated inventory
        System.out.println("\nUpdated Inventory:");
        inventory.displayInventory();

        System.out.println("\nInventory system initialized successfully.");
    }
}
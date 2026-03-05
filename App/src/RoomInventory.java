import java.util.HashMap;
import java.util.Map;

/**
 * RoomInventory
 *
 * Manages centralized room availability for the hotel booking system.
 * Uses a HashMap to store room types and their available counts.
 *
 * This class ensures a single source of truth for room availability.
 *
 * @author Prathik
 * @version 3.0
 */

public class RoomInventory {

    private HashMap<String, Integer> inventory;

    /**
     * Constructor initializes room availability.
     */
    public RoomInventory() {

        inventory = new HashMap<>();

        // Initial room availability
        inventory.put("Single Room", 5);
        inventory.put("Double Room", 3);
        inventory.put("Suite Room", 2);
    }

    /**
     * Returns the available count for a specific room type
     */
    public int getAvailability(String roomType) {

        return inventory.getOrDefault(roomType, 0);
    }

    /**
     * Updates room availability
     */
    public void updateAvailability(String roomType, int newCount) {

        inventory.put(roomType, newCount);
    }

    /**
     * Displays the entire inventory
     */
    public void displayInventory() {

        System.out.println("Current Room Inventory:");

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + " rooms available");
        }
    }
}
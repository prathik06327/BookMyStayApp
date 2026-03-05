/**
 * Abstract class representing a generic Room in the hotel.
 * It defines common properties shared by all room types.
 *
 * @author Prathik
 * @version 2.0
 */

public abstract class Room {

    protected String roomType;
    protected int numberOfBeds;
    protected int roomSize;
    protected double pricePerNight;

    public Room(String roomType, int numberOfBeds, int roomSize, double pricePerNight) {
        this.roomType = roomType;
        this.numberOfBeds = numberOfBeds;
        this.roomSize = roomSize;
        this.pricePerNight = pricePerNight;
    }

    public void displayRoomDetails() {
        System.out.println("Room Type: " + roomType);
        System.out.println("Beds: " + numberOfBeds);
        System.out.println("Size: " + roomSize + " sq ft");
        System.out.println("Price per Night: $" + pricePerNight);
    }
}
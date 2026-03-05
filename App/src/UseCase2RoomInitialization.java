/**
 * UseCase2RoomInitialization
 *
 * Demonstrates basic room initialization and static availability.
 * This use case introduces object modeling with inheritance and abstraction.
 *
 * @author Prathik
 * @version 2.0
 */

public class UseCase2RoomInitialization {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("       Hotel Booking System      ");
        System.out.println("            Version 2.0          ");
        System.out.println("=================================\n");

        // Create room objects
        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        // Static availability variables
        int singleRoomAvailable = 5;
        int doubleRoomAvailable = 3;
        int suiteRoomAvailable = 2;

        // Display room information
        System.out.println("Single Room Details:");
        singleRoom.displayRoomDetails();
        System.out.println("Available: " + singleRoomAvailable + "\n");

        System.out.println("Double Room Details:");
        doubleRoom.displayRoomDetails();
        System.out.println("Available: " + doubleRoomAvailable + "\n");

        System.out.println("Suite Room Details:");
        suiteRoom.displayRoomDetails();
        System.out.println("Available: " + suiteRoomAvailable + "\n");

        System.out.println("Thank you for using Book My Stay App!");
    }
}
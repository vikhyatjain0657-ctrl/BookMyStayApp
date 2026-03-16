/**
 * MAIN CLASS - UseCase2RoomInitialization
 *
 * Use Case 4: Room Search & Availability Check
 *
 * Description:
 * This class demonstrates room initialization
 * using simple domain variables before introducing
 * centralized inventory management.
 *
 * Availability is represented using
 * basic variables to highlight limitations.
 *
 * @version 2.1
 */
public class BookMyStayApp {

    /**
     * Application entry point.
     *
     * @param args Command-Line arguments
     */
    public static void main(String[] args) {

        // centralized inventory (read-only usage)
        RoomInventory inventory = new RoomInventory();

        // room domain objects
        Room single = new SingleRoom();
        Room doub = new DoubleRoom();   // Use Case 4 spec expects 400 sqft & 2508.0
        Room suite = new SuiteRoom();

        System.out.println("Room Search\n");

        System.out.println("Single Room:");
        single.displayRoomDetails();
        System.out.println("Available: "
                + inventory.getRoomAvailability().get("Single") + "\n");

        System.out.println("Double Room:");
        doub.displayRoomDetails();
        System.out.println("Available: "
                + inventory.getRoomAvailability().get("Double") + "\n");

        System.out.println("Suite Room:");
        suite.displayRoomDetails();
        System.out.println("Available: "
                + inventory.getRoomAvailability().get("Suite"));
    }
}
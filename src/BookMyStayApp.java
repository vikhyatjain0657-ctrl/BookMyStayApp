/**
 * MAIN CLASS - UseCase3InventorySetup
 *
 * @version 3.1
 */
public class BookMyStayApp {

    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();

        Room single = new SingleRoom();
        Room doub = new DoubleRoom();
        Room suite = new SuiteRoom();

        System.out.println("Hotel Room Inventory Status\n");

        System.out.println("Single Room:");
        single.displayRoomDetails();
        System.out.println("Available Rooms: "
                + inventory.getRoomAvailability().get("Single") + "\n");

        System.out.println("Double Room:");
        doub.displayRoomDetails();
        System.out.println("Available Rooms: "
                + inventory.getRoomAvailability().get("Double") + "\n");

        System.out.println("Suite Room:");
        suite.displayRoomDetails();
        System.out.println("Available Rooms: "
                + inventory.getRoomAvailability().get("Suite"));
    }
}
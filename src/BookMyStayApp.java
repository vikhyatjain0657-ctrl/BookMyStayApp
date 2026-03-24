/**
 * MAIN CLASS - UseCase2RoomInitialization
 *
 * Use Case 2: Basic Room Types & Static Availability
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

        System.out.println("Room Allocation Processing");

        RoomInventory inventory = new RoomInventory();
        BookingRequestQueue queue = new BookingRequestQueue();
        RoomAllocationService service = new RoomAllocationService();

        // booking requests (FIFO)
        queue.addRequest(new Reservation("Abhi", "Single"));
        queue.addRequest(new Reservation("Subha", "Single"));
        queue.addRequest(new Reservation("Vanmathi", "Suite"));

        // process queue
        while (queue.hasPendingRequests()) {
            Reservation r = queue.processRequest();
            service.allocateRoom(r, inventory);
        }
    }
}
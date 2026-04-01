import java.util.Scanner;

/**
 * MAIN CLASS - UseCase9ErrorHandlingValidation
 *
 * Demonstrates validation + exception handling.
 *
 * @version 9.0
 */
public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("Booking Validation");

        Scanner scanner = new Scanner(System.in);

        try {
            // Input
            System.out.print("Enter guest name: ");
            String guestName = scanner.nextLine();

            System.out.print("Enter room type (Single/Double/Suite): ");
            String roomType = scanner.nextLine();

            // Core components
            RoomInventory inventory = new RoomInventory();
            ReservationValidator validator = new ReservationValidator();
            BookingRequestQueue queue = new BookingRequestQueue();

            // Validation
            validator.validate(guestName, roomType, inventory);

            // If valid → add to queue
            queue.addRequest(new Reservation(guestName, roomType));

            System.out.println("Booking request added successfully.");

        } catch (InvalidBookingException e) {

            // Domain-specific error handling
            System.out.println("Booking failed: " + e.getMessage());

        } finally {
            scanner.close();
        }
    }
}
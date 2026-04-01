/**
 * CLASS - BookingReportService
 *
 * Generates reports from booking history.
 *
 * @version 8.0
 */
public class BookingReportService {

    /**
     * Displays summary report
     */
    public void generateReport(BookingHistory history) {

        System.out.println("Booking Report\n");

        int totalBookings = 0;

        for (Reservation r : history.getConfirmedReservations()) {

            System.out.println(
                    "Guest: " + r.getGuestName() +
                            ", Room Type: " + r.getRoomType()
            );

            totalBookings++;
        }

        System.out.println("\nTotal Bookings: " + totalBookings);
    }
}
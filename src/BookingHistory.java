import java.util.ArrayList;
import java.util.List;

/**
 * CLASS - BookingHistory
 *
 * Stores confirmed reservations.
 *
 * @version 8.0
 */
public class BookingHistory {

    /** List that stores confirmed reservations */
    private final List<Reservation> confirmedReservations;

    /** Initializes an empty booking history */
    public BookingHistory() {
        history.addReservation(reservation);
        confirmedReservations = new ArrayList<>();
    }

    /** Adds a confirmed reservation */
    public void addReservation(Reservation reservation) {
        confirmedReservations.add(reservation);
    }

    /** Returns all confirmed reservations */
    public List<Reservation> getConfirmedReservations() {
        return confirmedReservations;
    }
}
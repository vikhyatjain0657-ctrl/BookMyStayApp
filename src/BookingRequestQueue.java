import java.util.LinkedList;
import java.util.Queue;

/**
 * CLASS - BookingRequestQueue
 *
 * Manages booking requests using FIFO queue.
 *
 * @version 5.0
 */
public class BookingRequestQueue {

    private Queue<Reservation> queue;

    public BookingRequestQueue() {
        queue = new LinkedList<>();
    }

    public void addRequest(Reservation reservation) {
        queue.offer(reservation);
    }

    public boolean hasPendingRequests() {
        return !queue.isEmpty();
    }

    public Reservation processRequest() {
        return queue.poll();
    }
}
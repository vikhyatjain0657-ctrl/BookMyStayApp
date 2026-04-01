import java.util.LinkedList;
import java.util.Queue;

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
import java.util.HashMap;
import java.util.Map;

/**
 * CLASS - RoomAllocationService
 *
 * Handles reservation confirmation and
 * safe room allocation.
 *
 * @version 6.0
 */
public class RoomAllocationService {

    // Tracks next room sequence per room type
    private Map<String, Integer> roomSequence;

    public RoomAllocationService() {
        roomSequence = new HashMap<>();
    }

    /**
     * Confirms booking by allocating room
     * and updating centralized inventory.
     */
    public void allocateRoom(Reservation reservation, RoomInventory inventory) {

        String roomType = reservation.getRoomType();
        int available = inventory.getRoomAvailability().get(roomType);

        if (available > 0) {

            String roomId = generateRoomId(roomType);

            // update inventory immediately
            inventory.updateAvailability(roomType, available - 1);

            System.out.println(
                    "Booking confirmed for Guest: "
                            + reservation.getGuestName()
                            + ", Room ID: "
                            + roomId
            );

        } else {
            System.out.println(
                    "Booking failed for Guest: "
                            + reservation.getGuestName()
                            + " (No rooms available)"
            );
        }
    }

    /** Generates unique room ID */
    private String generateRoomId(String roomType) {

        int next = roomSequence.getOrDefault(roomType, 0) + 1;
        roomSequence.put(roomType, next);

        return roomType + "-" + next;
    }
}
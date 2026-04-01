/**
 * CLASS - ReservationValidator
 *
 * Validates booking input before processing.
 *
 * @version 9.0
 */
public class ReservationValidator {

    /**
     * Validates booking input
     */
    public void validate(String guestName,
                         String roomType,
                         RoomInventory inventory)
            throws InvalidBookingException {

        // Validate guest name
        if (guestName == null || guestName.trim().isEmpty()) {
            throw new InvalidBookingException("Guest name cannot be empty.");
        }

        // Validate room type existence
        if (!inventory.getRoomAvailability().containsKey(roomType)) {
            throw new InvalidBookingException("Invalid room type selected.");
        }

        // Validate availability
        int available = inventory.getRoomAvailability().get(roomType);
        if (available <= 0) {
            throw new InvalidBookingException("No rooms available for selected type.");
        }
    }
}
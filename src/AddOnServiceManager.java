import java.util.*;

/**
 * CLASS - AddOnServiceManager
 *
 * Manages add-on services per reservation.
 *
 * @version 7.0
 */
public class AddOnServiceManager
{

    /**
     * Maps reservation ID to selected services.
     * Key -> Reservation ID
     * Value -> List of selected services
     */
    private Map<String, List<AddOnService>> servicesByReservation;

    public AddOnServiceManager() {
        servicesByReservation = new HashMap<>();
    }

    /**
     * Attach a service to a reservation
     */
    public void addService(String reservationId, AddOnService service) {

        servicesByReservation
                .computeIfAbsent(reservationId, k -> new ArrayList<>())
                .add(service);
    }

    /**
     * Calculate total add-on cost
     */
    public double getTotalCost(String reservationId) {

        List<AddOnService> services =
                servicesByReservation.getOrDefault(reservationId, new ArrayList<>());

        double total = 0;
        for (AddOnService s : services) {
            total += s.getCost();
        }
        return total;
    }
}

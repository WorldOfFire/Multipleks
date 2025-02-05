import java.util.Set;

public class Ticket {
    private final String cinemaRoom;
    private final float ticketPrice;
    private final Set<String> reservedSeats;
    private final Screening screening; // Odwołanie do seansu

    public Ticket(String cinemaRoom, float ticketPrice, Set<String> reservedSeats, Screening screening) {
        this.cinemaRoom = cinemaRoom;
        this.ticketPrice = ticketPrice;
        this.reservedSeats = reservedSeats;
        this.screening = screening;
    }

    public String getCinemaRoom() {
        return cinemaRoom;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public Set<String> getReservedSeats() {
        return reservedSeats;
    }

    public Screening getScreening() {
        return screening;
    }
}

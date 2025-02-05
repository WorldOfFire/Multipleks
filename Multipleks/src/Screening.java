import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Screening {
    private final Movie movie;
    private final LocalDate date;
    private final LocalTime time;
    private final Cinema cinema; // Odwołanie do kina
    private final List<Ticket> ticketsList;

    public Screening(Movie movie, LocalDate date, LocalTime time, Cinema cinema) {
        this.movie = movie;
        this.date = date;
        this.time = time;
        this.cinema = cinema;
        this.ticketsList = new ArrayList<>();
    }

    public Movie getMovie() {
        return movie;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public List<Ticket> getTicketsList() {
        return ticketsList;
    }

    public void addTicket(Ticket ticket) {
        ticketsList.add(ticket);
    }
}

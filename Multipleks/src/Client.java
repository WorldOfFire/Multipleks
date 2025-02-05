import java.util.ArrayList;
import java.util.List;

public class Client {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final List<Ticket> ticketList;

    public Client(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.ticketList = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public List<Ticket> getTicketList() {
        return ticketList;
    }

    public void addTicket(Ticket ticket) {
        ticketList.add(ticket);
    }

    public void printTicketDetails() {
        for (Ticket ticket : ticketList) {
            // Szukamy seansu, w którym znajduje się ten bilet
            Screening screening = ticket.getScreening();  // Pobieramy seans z biletu
            Cinema cinema = screening.getCinema();        // Pobieramy kino z seansu
            Movie movie = screening.getMovie();           // Pobieramy film z seansu

            // Wyświetlanie szczegółów
            System.out.println("Cinema: " + cinema.getCinemaName() + " | Address: " + cinema.getCinemaAddress());
            System.out.println("Movie: " + movie.getTitle() + " | VIP: " + (movie.isVIP() ? "Yes" : "No") + " | 3D: " + (movie.is3D() ? "Yes" : "No"));
            System.out.println("Screening Date: " + screening.getDate() + " | Time: " + screening.getTime());
            System.out.println("Cinema Room: " + ticket.getCinemaRoom() + " | Reserved Seats: " + ticket.getReservedSeats() + " | Price: " + ticket.getTicketPrice());
            System.out.println("Customer: " + getFirstName() + " " + getLastName());
            System.out.println("------------------------------------------------------");
        }
    }

}

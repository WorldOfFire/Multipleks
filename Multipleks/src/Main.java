import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Konfiguracja kin
        Cinema cinema1 = new Cinema("Helios", "Al. Jerozolimskie 179, 02-222 Warszawa");
        Cinema cinema2 = new Cinema("Multikino", "Aleja Zwycięstwa 14, 80-219 Gdańsk");

        // Konfiguracja filmów
        Movie movie1 = new Movie("Venom", false, false);
        Movie movie2 = new Movie("Avatar: Istota Wody", true, false);
        Movie movie3 = new Movie("Venom", false, true);
        Movie movie4 = new Movie("Avatar: Istota Wody", true, true);

        // Konfiguracja seansów i przypisanie kina do każdego seansu
        Screening screening1 = new Screening(movie1, LocalDate.of(2025, 2, 12), LocalTime.of(10, 30), cinema1);
        Screening screening2 = new Screening(movie2, LocalDate.of(2025, 2, 12), LocalTime.of(13, 15), cinema1);
        Screening screening3 = new Screening(movie3, LocalDate.of(2025, 2, 12), LocalTime.of(12, 30), cinema2);
        Screening screening4 = new Screening(movie4, LocalDate.of(2025, 2, 22), LocalTime.of(18, 15), cinema2);

        // Konfiguracja biletów
        Ticket ticket1 = new Ticket("A", 200.99f, Set.of("G1", "G2", "G3"), screening1); // Przypisanie seansu
        Ticket ticket2 = new Ticket("B", 100.89f, Set.of("H2", "H3"), screening2); // Przypisanie seansu

        // Dodanie biletów do repertuarów
        screening1.addTicket(ticket1);
        screening2.addTicket(ticket2);

        // Dodanie biletów do klientów
        Client client1 = new Client("Anna", "Kowalska", "kowalska@gmail.com");
        client1.addTicket(ticket1);
        client1.addTicket(ticket2);

        // Dodanie repertuarów do kin
        cinema1.addScreening(screening1);
        cinema2.addScreening(screening2);
        cinema1.addScreening(screening3);
        cinema2.addScreening(screening4);

        // Wyświetlanie repertuaru do 7 dni w przód
        System.out.println("------------------------------------------------------");
        cinema1.printProgramme();
        cinema2.printProgramme();

        // Wyświetlanie biletów klienta
        client1.printTicketDetails();
    }
}

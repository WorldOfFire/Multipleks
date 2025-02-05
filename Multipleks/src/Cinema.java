import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private final String cinemaName;
    private final String cinemaAddress;
    private final List<Screening> screenings;

    public Cinema(String cinemaName, String cinemaAddress) {
        this.cinemaName = cinemaName;
        this.cinemaAddress = cinemaAddress;
        this.screenings = new ArrayList<>();
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public String getCinemaAddress() {
        return cinemaAddress;
    }

    public List<Screening> getScreenings() {
        return screenings;
    }

    public void addScreening(Screening screening) {
        screenings.add(screening);
    }

    public void printProgramme() {
        LocalDate today = LocalDate.now();
        LocalDate nextWeek = today.plusWeeks(1);
        LocalDate screeningDate;

        System.out.println(getCinemaName() + " | " + getCinemaAddress());
        for (Screening screening : screenings) {
            screeningDate = screening.getDate();
            if((screeningDate.isAfter(today) || screeningDate.isEqual(today)) && (screeningDate.isBefore(nextWeek)|| screeningDate.isEqual(nextWeek))) {
                System.out.println("Movie: " + screening.getMovie().getTitle() + " | Date: " + screening.getDate() + " | Time: " + screening.getTime());
            }
        }
        System.out.println("------------------------------------------------------");
    }
}

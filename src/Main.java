import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Hosté
        Guest adela = new Guest("Adéla", "Malíková", LocalDate.of (1993, 3, 13));
        Guest jan = new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));
        jan.setDatumNarozeni(LocalDate.of(1995, 4, 5));

        System.out.println();
        System.out.println(jan);
        System.out.println();

        // Pokoje
        Room pokoj1 = new Room(1, 1, true, true, 1000);
        Room pokoj2 = new Room(2, 1, true, true, 1000);
        Room pokoj3 = new Room(3, 3, false, true, 2400);

        // Rezervace
        List<Booking> rezervace = new ArrayList<>();

        // Rezervace pro Adélu
        rezervace.add(new Booking(pokoj1, Arrays.asList(adela), LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26), Booking.PobytTyp.REKREACNI));

        // Rezervace pro oba
        rezervace.add(new Booking(pokoj3, Arrays.asList(adela,jan), LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), Booking.PobytTyp.REKREACNI));

        // Výpis všech rezervací
        for (Booking r : rezervace) {
            System.out.println(r);
            System.out.println();
        }
    }
}
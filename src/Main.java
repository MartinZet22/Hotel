import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Hosté
        Guest adela = new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
        Guest jan = new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));

        Guest brambora = new Guest("Stará", "Brambora", LocalDate.of(2024, 9, 27));

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
        rezervace.add(new Booking(pokoj1, Arrays.asList(adela), LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26), Booking.PobytTyp.PRACOVNI));

        // Rezervace pro oba
        rezervace.add(new Booking(pokoj3, Arrays.asList(adela,jan), LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), Booking.PobytTyp.REKREACNI));

        // Rezervace pro Bramboru s automatickým nastavením pobytu
        rezervace.add(new Booking(pokoj2, Arrays.asList(brambora), Booking.PobytTyp.REKREACNI));

        // Výpis všech rezervací
        for (Booking r : rezervace) {
            System.out.println(r);
            System.out.println();
        }

        // Výpis rezervací pro konkrétního hosta (např. Stará Brambora)
        List<Booking> rezervaceBrambory = getBookingsForGuest(brambora, rezervace);
        System.out.println("Rezervace pro Starou Bramboru:");
        for (Booking r : rezervaceBrambory) {
            System.out.println(r);
            System.out.println();
        }

        // Výpis rezervací pro konkretní pokoj (např. Pokoj číslo 3)
        List<Booking> rezervacePokoj3 = getBookingsForRoom(pokoj3, rezervace);
        System.out.println("Rezervace pro pokoj č. 3:");
        for (Booking r : rezervacePokoj3) {
            System.out.println(r);
            System.out.println();
        }


    }

    public static List<Booking> getBookingsForGuest(Guest guest, List<Booking> rezervace) {
        List<Booking> result = new ArrayList<>();
        for (Booking booking : rezervace) {
            if (booking.getHosti().contains(guest)) {
                result.add(booking);
            }
        }
        return result;
    }

    public static List<Booking> getBookingsForRoom(Room room, List<Booking> rezervace) {
        List<Booking> result = new ArrayList<>();
        for (Booking booking : rezervace) {
            if (booking.getPokoj().getCisloPokoje() == room.getCisloPokoje()) {
                result.add(booking);
            }
        }
        return result;
    }
}
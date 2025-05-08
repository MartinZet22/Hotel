import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Booking {
    private Room pokoj;
    private List<Guest> hosti = new ArrayList<>();
    private LocalDate od;
    private LocalDate doKdy;
    private PobytTyp typPobytu;

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    // Původní konstruktor - umožňuje zadat konkrétní data
    public Booking(Room pokoj, List<Guest> hosti, LocalDate od, LocalDate doKdy, PobytTyp typPobytu) {
        if (hosti == null || hosti.isEmpty()) {
            throw new IllegalArgumentException("Rezervace musí obsahovat alespoň jednoho hosta.");
        }
        this.pokoj = pokoj;
        this.hosti = hosti;
        this.od = od;
        this.doKdy = doKdy;
        this.typPobytu = typPobytu;
    }

    // Nový konstruktor - automaticky nastaví rezervaci na dnešek + 6 nocí
    public Booking(Room pokoj, List<Guest> hosti, PobytTyp typPobytu) {
        this(pokoj, hosti, LocalDate.now(), LocalDate.now().plusDays(6), typPobytu);
    }


    public enum PobytTyp {
        PRACOVNI,
        REKREACNI
    }

    public String getFormattedOd() {
        return od.format(FORMATTER);
    }

    public String getFormattedDoKdy() {
        return doKdy.format(FORMATTER);
    }

    @Override
    public String toString() {
        String hostiText = "";
        for (Guest g : hosti) {
            hostiText = hostiText + "  - " + g.getDescription() + "\n";
        }

        return "Rezervace:\n" +
                "Pokoj: " + pokoj.toString() + "\n" +
                "Hosti:\n" + hostiText +
                "Pobyt: od " + getFormattedOd() + " do " + getFormattedDoKdy() + "\n" +
                "Typ pobytu: '" + typPobytu + "'";
    }
}

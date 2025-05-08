import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {
    private Room pokoj;
    private List<Guest> hosti = new ArrayList<>();
    private LocalDate od;
    private LocalDate doKdy;
    private String typPobytu;

    public Booking(Room pokoj, List<Guest> hosti, LocalDate od, LocalDate do_, String typPobytu) {
        if (hosti == null || hosti.isEmpty()) {
            throw new IllegalArgumentException("Rezervace musí obsahovat alespoň jednoho hosta.");
        }
        this.pokoj = pokoj;
        this.hosti = hosti;
        this.od = od;
        this.doKdy = do_;
        this.typPobytu = typPobytu;
    }

    @Override
    public String toString() {
        String hostiText = "";
        for (Guest g : hosti) {
            hostiText += "  - " + g.toString() + "\n";
        }

        return "Rezervace:\n" +
                "Pokoj: " + pokoj.toString() + "\n" +
                "Hosti:\n" + hostiText +
                "Pobyt: od " + od + " do " + doKdy + "\n" +
                "Typ pobytu: '" + typPobytu + "'";
    }
}

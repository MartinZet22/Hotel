import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Guest {
    private String jmeno;
    private String prijmeni;
    private LocalDate datumNarozeni;

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public Guest(String jmeno, String prijmeni, LocalDate datumNarozeni) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.datumNarozeni = datumNarozeni;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public LocalDate getDatumNarozeni() {
        return datumNarozeni;
    }

    public void setDatumNarozeni(LocalDate datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }

    public String getFormattedDatumNarozeni() {
        return datumNarozeni.format(FORMATTER);
    }

    // Nová metoda GETDESCRIPTION
    public String getDescription() {
        return jmeno + " " + prijmeni + " (" + getFormattedDatumNarozeni() + ")";
    }

    @Override
    public String toString() {
        return jmeno + " " + prijmeni + " (" + getFormattedDatumNarozeni() + ")";
    }
}

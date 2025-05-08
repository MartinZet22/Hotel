import java.time.LocalDate;

public class Guest {
    private String jmeno;
    private String prijmeni;
    private LocalDate datumNarozeni;

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

    @Override
    public String toString() {
        return "Jméno: '" + jmeno + "', Příjmení: '" + prijmeni + "', Datum narození: " + datumNarozeni;
    }
}

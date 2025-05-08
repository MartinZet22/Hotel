public class Room {
    private int cislo;
    private int pocetLuzek;
    private boolean balkon;
    private boolean vyhledNaMore;
    private int cenaZaNoc;

    public Room(int cislo, int pocetLuzek, boolean balkon, boolean vyhledNaMore, int cenaZaNoc) {
        this.cislo = cislo;
        this.pocetLuzek = pocetLuzek;
        this.balkon = balkon;
        this.vyhledNaMore = vyhledNaMore;
        this.cenaZaNoc = cenaZaNoc;
    }

    public int getCislo() {
        return cislo;
    }

    public void setCislo(int cislo) {
        this.cislo = cislo;
    }

    public int getPocetLuzek() {
        return pocetLuzek;
    }

    public void setPocetLuzek(int pocetLuzek) {
        this.pocetLuzek = pocetLuzek;
    }

    public boolean isBalkon() {
        return balkon;
    }

    public void setBalkon(boolean balkon) {
        this.balkon = balkon;
    }

    public boolean isVyhledNaMore() {
        return vyhledNaMore;
    }

    public void setVyhledNaMore(boolean vyhledNaMore) {
        this.vyhledNaMore = vyhledNaMore;
    }

    public int getCenaZaNoc() {
        return cenaZaNoc;
    }

    public void setCenaZaNoc(int cenaZaNoc) {
        this.cenaZaNoc = cenaZaNoc;
    }

    @Override
    public String toString() {
        return "Číslo " + cislo + ", Počet lůžek: " + pocetLuzek +
                ", Balkón: " + (balkon ? "ano" : "ne") +
                ", Výhled na moře: " + (vyhledNaMore ? "ano" : "ne") +
                ", Cena za noc: " + cenaZaNoc + " Kč";
    }
}

package tehtava7;

public class Henkilo {
    private String nimi;
    private int ika;

    private static int laskuri = 0;

    public Henkilo(String nimi, int ika) {
        setNimi(nimi);
        setIka(ika);

        laskuri++;
    }

    // GETTERIT JA SETTERIT

    // NIMI
    public String getNimi() {
        return nimi;
    }
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    // IKA
    public int getIka() {
        return ika;
    }
    public void setIka(int ika) {
        this.ika = ika;
    }

    // METODIT
    public static int getLaskuri() {
        return laskuri;
    }
    public String toString() {
        return nimi + ", " + ika + " vuotta";
    }
}
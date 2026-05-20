package tehtava11;

public abstract class Ajoneuvo {
    private String merkki;
    private int nopeus;

    public Ajoneuvo(String merkki, int nopeus) {
        setMerkki(merkki);
        setNopeus(nopeus);
    }

    public String getMerkki() {
        return merkki;
    }
    public void setMerkki(String merkki) {
        this.merkki = merkki;
    }
    public int getNopeus() {
        return nopeus;
    }
    public void setNopeus(int nopeus) {
        this.nopeus = nopeus;
    }

    public abstract String kulkutapa();
    public abstract double laskeToimintamatka();
    public abstract String toString();
}

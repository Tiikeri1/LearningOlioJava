package tehtava10;

public class Elain {
    private String nimi;
    private int ika;

    public Elain(String nimi, int ika) {
        setNimi(nimi);
        setIka(ika);
    }

    public String getNimi() {
        return nimi;
    }
    public int getIka() {
        return ika;
    }
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
    public void setIka(int ika) {
        if(ika > 0)
            this.ika = ika;
    }

    public String teeAani() {
        return "...";
    }
    public String toString() {
        return "Elain [nimi=" + nimi + ", ika=" + ika + "]";
    }
}

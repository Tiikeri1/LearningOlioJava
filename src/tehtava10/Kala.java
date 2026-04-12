package tehtava10;

public class Kala extends Elain {
    private String vesisto;

    public Kala(String nimi, int ika, String vesisto) {
        super(nimi, ika);
        setVesisto(vesisto);
    }

    public String getVesisto() {
        return vesisto;
    }
    public void setVesisto(String vesisto) {
        this.vesisto = vesisto;
    }

    // Override käyttää valmista metodia, mutta muuttaa sen tämän luokan jutuista.
    @Override
    public String teeAani() {
        return "Blub blub!";
    }
    @Override
    public String toString() {
        return "Kala [nimi=" + getNimi() + ", ika=" + getIka() + ", vesisto=" + vesisto + "]";
    }
}

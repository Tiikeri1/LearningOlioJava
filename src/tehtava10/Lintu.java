package tehtava10;

public class Lintu extends Elain{
    private double siipivali;

    public Lintu(String nimi, int ika, double siipivali) {
        super(nimi, ika);
        setSiipivali(siipivali);
    }

    public double getSiipivali() {
        return siipivali;
    }
    public void setSiipivali(double siipivali) {
        if(siipivali > 0)
            this.siipivali = siipivali;
    }

    // Override käyttää valmista metodia, mutta muuttaa sen tämän luokan jutuista.
    @Override
    public String teeAani() {
        return "Tweet tweet!";
    }
    @Override
    public String toString(){
        return "Lintu [nimi=" + getNimi() + ", ika=" + getIka() + ", siipivali=" + siipivali + "m]";
    }
}

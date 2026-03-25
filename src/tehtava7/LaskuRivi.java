package tehtava7;

public class LaskuRivi {
    private String tuote;
    private double hinta;
    private int maara;

    public LaskuRivi(String tuote, double hinta, int maara){
        setTuote(tuote);
        setHinta(hinta);
        setMaara(maara);
    }

    // GETTERIT JA SETTERIT
    // TUOTE
    public String  getTuote() {
        return tuote;
    }
    public void setTuote(String tuote) {
        this.tuote = tuote;
    }

    // HINTA
    public double getHinta() {
        return hinta;
    }
    public void setHinta(double hinta) {
        if(hinta >= 0)
            this.hinta = hinta;
    }

    // MAARA
    public int getMaara() {
        return maara;
    }
    public void setMaara(int maara) {
        if(maara >= 0)
            this.maara = maara;
    }

    // METODIT
    public double getRiviHinta(){
        return hinta * maara;
    }

    public String toString(){
        return tuote + " x " + maara + " = " + getRiviHinta() + "€";
    }
}

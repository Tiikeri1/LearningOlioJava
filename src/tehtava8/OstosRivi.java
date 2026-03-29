package tehtava8;

// Tehtävä 3: Kompositio — Ostoskori

// OstosRivi luokka
public class OstosRivi {

    // private kentät
    private String tuote;
    private double hinta;
    private int maara;

    // Konstruktori
    public OstosRivi(String tuote, double hinta, int maara) {
        setTuote(tuote);
        setHinta(hinta);
        setMaara(maara);
    }

    // Getterit
    public String getTuote() {
        return tuote;
    }
    public double getHinta() {
        return hinta;
    }
    public int getMaara() {
        return maara;
    }

    // Setterit
    public void setTuote(String tuote) {
        this.tuote = tuote;
    }
    public void setHinta(double hinta) {
        if(hinta > 0)
            this.hinta = hinta;
    }
    public void setMaara(int maara) {
        if(maara > 0)
            this.maara = maara;
    }

    // Metodit
    public double getRiviHinta(){
        return hinta * maara;
    }
    public String toString(){
        return tuote + " x " + maara + " = " + getRiviHinta() + "€";
    }
}

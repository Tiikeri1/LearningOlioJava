package tehtava9;

// KOMPOSITIO

public class TilausRivi {
    private String annos;
    private double hinta;
    private int maara;

    public TilausRivi(String annos, double hinta, int maara) {
        setAnnos(annos);
        setHinta(hinta);
        setMaara(maara);
    }

    public String getAnnos() {
        return annos;
    }
    public double getHinta() {
        return hinta;
    }
    public int getMaara() {
        return maara;
    }
    public void setAnnos(String annos) {
        this.annos = annos;
    }
    public void setHinta(double hinta) {
        if(hinta > 0)
            this.hinta = hinta;
    }
    public void setMaara(int maara) {
        if(maara > 0)
            this.maara = maara;
    }

    public double getRiviHinta(){
        return hinta * maara;
    }

    public String toString(){
        return annos + " x " + maara + " = " + getRiviHinta() + "€";
    }
}

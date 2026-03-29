package tehtava8;

// Tehtävä 1: Static-laskuri ja keskiarvo

// Tuote Luokka
public class Tuote {

    // private kentät
    private String nimi;
    private double hinta;

    // staattiset private kentät
    private static int laskuri = 0;
    private static double hintojenSumma = 0.0;

    // Konstruktori
    public Tuote(String nimi, double hinta) {
        setNimi(nimi);
        setHinta(hinta);

        laskuri++;
        hintojenSumma += hinta;
    }

    // Getterit
    public String getNimi() {
        return nimi;
    }
    public double getHinta() {
        return hinta;
    }

    // Setterit
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
    public void setHinta(double hinta) {
        if(hinta > 0)
            this.hinta = hinta;
    }

    // Metodit
    public static int getLaskuri() {
        return laskuri;
    }
    public static double getKeskiHinta() {
        return hintojenSumma / laskuri;
    }
}

package tehtava4;

// Class / Luokka
public class Auto {
    private String merkki;
    private String malli;
    private int vuosimalli;
    private double nopeus;

    // Constructor / Konstruktori
    public Auto(String merkki, String malli, int vuosimalli){
        setMerkki(merkki);
        setMalli(malli);
        if(vuosimalli >= 1886){
            setVuosimalli(vuosimalli);
        }
        this.nopeus = 0;
    }

    // Getterit
    public String getMerkki() {
        return merkki;
    }
    public String getMalli() {
        return malli;
    }
    public int getVuosimalli() {
        return vuosimalli;
    }
    public double getNopeus() {
        return nopeus;
    }

    // Setterit
    public void setMerkki(String merkki) {
        this.merkki = merkki;
    }
    public void setMalli(String malli) {
        this.malli = malli;
    }
    public void setVuosimalli(int vuosimalli) {
        if(vuosimalli >= 1886){
            this.vuosimalli = vuosimalli;
        }
    }
    public void setNopeus(double nopeus) {
        if(nopeus >= 0){
            this.nopeus = nopeus;
        }
    }

    // Metodit / Funktiot
    public void kiihdyta(double maara){
        if(maara > 0){
            this.nopeus += maara;
        }
    }

    public void jarruta(double maara){
        if(maara <= this.nopeus){
            this.nopeus -= maara;
        }
    }

    public String toString(){
        return merkki + " " + malli + " (" + vuosimalli + ") - " + nopeus + " km/h";
    }
}

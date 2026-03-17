package tehtava4;

// Class
public class Tuote {
    private String nimi;
    private double hinta;
    private double alennusProsentti;

    // Konstruktorit
    public Tuote(String nimi, double hinta){
        setNimi(nimi);
        setHinta(hinta);
        this.alennusProsentti = 0.0;
    }
    public Tuote(String nimi, double hinta, double alennusProsentti){
        setNimi(nimi);
        if(hinta > 0){
            setHinta(hinta);
        }
        if(alennusProsentti >= 0 && alennusProsentti <= 100){
            setAlennusProsentti(alennusProsentti);
        }
    }

    // Getterit
    public String getNimi(){
        return nimi;
    }
    public double getHinta(){
        return hinta;
    }
    public double getAlennusProsentti(){
        return alennusProsentti;
    }

    // Setterit
    public void setNimi(String nimi){
        this.nimi = nimi;
    }
    public void setHinta(double hinta){
        if(hinta > 0){
            this.hinta = hinta;
        }
    }
    public void setAlennusProsentti(double alennusProsentti){
        if(alennusProsentti >= 0 && alennusProsentti <= 100) {
            this.alennusProsentti = alennusProsentti;
        }
    }

    // Metodit
    public double alennettuHinta(){
        return hinta * (1 - alennusProsentti / 100);
    }

    public String toString(){
        return nimi + " " + String.format("%.2f", hinta) + "€ (alennus " + alennusProsentti + "%)";
    }
}

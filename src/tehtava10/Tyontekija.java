package tehtava10;

public class Tyontekija {
    private String nimi;
    private double peruspalkka;

    public Tyontekija(String nimi, double peruspalkka) {
        setNimi(nimi);
        setPeruspalkka(peruspalkka);
    }
    public String getNimi() {
        return nimi;
    }
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public double getPeruspalkka() {
        return peruspalkka;
    }
    public void setPeruspalkka(double peruspalkka) {
        if(peruspalkka > 0)
            this.peruspalkka = peruspalkka;
    }

    public double laskePalkka(){
        return peruspalkka;
    }
    public String toString(){
        return nimi + " - palkka: " + laskePalkka() + "€";
    }
}

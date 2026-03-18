package tehtava6;

import java.util.ArrayList;

// Luokka
public class Asiakas {
    private String nimi;
    private String puhelinnumero;
    private ArrayList<Huone> varaukset;

    // Konstruktori
    public Asiakas(String nimi, String puhelinnumero){
        setNimi(nimi);
        setPuhelinnumero(puhelinnumero);
        varaukset = new ArrayList<>();
    }

    // Getterit
    public String getNimi() {
        return nimi;
    }
    public String getPuhelinnumero() {
        return puhelinnumero;
    }
    public ArrayList<Huone> getVaraukset(){
        return varaukset;
    }

    // Setterit
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
    public void setPuhelinnumero(String puhelinnumero) {
        this.puhelinnumero = puhelinnumero;
    }

    // Metodit
    public void lisaaVaraus(Huone h){
        varaukset.add(h);
    }
    public void poistaVaraus(Huone h){
        varaukset.remove(h);
    }
    public double laskeKokonaisHinta(int yot){
        int sum = 0;
        for(Huone h : varaukset){
            sum += h.getHintaPerYo() * yot;
        }
        return sum;
    }
    public String toString(){
        return nimi + " - puh: " + puhelinnumero + " - varauksia: " + varaukset;
    }
}

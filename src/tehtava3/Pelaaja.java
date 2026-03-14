package tehtava3;

public class Pelaaja {
    public String nimi;
    public int pisteet;
    public boolean onAktiivinen;

    public Pelaaja(String nimi){
        this.nimi=nimi;
        this.pisteet=0;
        this.onAktiivinen=true;
    }

    public void lisaaPisteet(int maara){
        if(maara > 0){
            this.pisteet += maara;
        }
    }

    public void poistaAktiivisuus(){
        this.onAktiivinen=false;
    }

    public String toString(){
        String tila = onAktiivinen ? "aktiivinen" : "ei aktiivinen";
        return nimi + " - " + pisteet + "p [" + tila + "]";
    }
}

package tehtava5;

import java.util.ArrayList;

// Class
public class Kirjasto {
    private String nimi;
    private ArrayList<Kirja> kirja;

    // Konstruktori
    public Kirjasto(String nimi){
        setNimi(nimi);
        kirja = new ArrayList<>();
    }

    // Getterit
    public String getNimi() {
        return nimi;
    }
    public ArrayList<Kirja> getKirja() {
        return kirja;
    }

    // Setterit
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
    // Listalle ei tarvitse setteriä

    // Metodit
    public void lisaaKirja(Kirja k){
        kirja.add(k);
    }

    public void tulostaKaikki(){
        for(Kirja k : kirja){
            System.out.println(k.toString());
        }
    }

    public int saatavilla(){
        int saatavilla = 0;
        for(Kirja k : kirja){
            if(k.onLainassa() == false){
                saatavilla++;
            }
        }
        return saatavilla;
    }

    public int lainassa(){
        int lainassa = 0;
        for(Kirja k : kirja){
            if(k.onLainassa() == true){
                lainassa++;
            }
        }
        return lainassa;
    }

    public Kirja etsiKirja(String nimi){
        Kirja etsitty = null;
        for(Kirja k : kirja){
            if(k.getNimi().equals(nimi)){
                etsitty = k;
            }
        }
        return etsitty;
    }
}

package tehtava2;

import java.util.ArrayList;

public class Kauppa {
    public String nimi;
    public ArrayList<Tuote> tuote; // Tehdään lista tuote.

    public Kauppa(String nimi){
        this.nimi = nimi;
        tuote = new ArrayList<>(); // Alustetaan lista.
    }

    public void lisaaTuote(Tuote t){
        tuote.add(t);
    }

    public void tulostaVarastoTilanne(){
        for (int i = 0; i < tuote.size(); i++) {
            System.out.println(tuote.get(i).toString());
        }
    }

    public Tuote halvinTuote(){
        Tuote halvin = tuote.get(0); // Alustetaan halvimmaksi ensin eka tuote.
        for(int i = 1; i < tuote.size(); i++){ // Käydään lista läpi ja katsotaan jos löytyy halvempi.
            if(tuote.get(i).hinta < halvin.hinta){
                halvin = tuote.get(i); // Jos halvempi löytyy asetetaan se halvimmaksi.
            }
        }
        return halvin; // Palautetaan halvin.
    }

    public double varastonArvo(){
        double sum = 0.0;
        for(int i = 0; i < tuote.size(); i++){ // Käydään lista läpi ja lisätään jokaisen tuotteen hinta summaan.
            sum += tuote.get(i).hinta * tuote.get(i).maara;
        }
        return sum; // Palautetaan summa.
    }

    public void poistaTuote(Tuote tuote){
        this.tuote.remove(tuote);
    }
}

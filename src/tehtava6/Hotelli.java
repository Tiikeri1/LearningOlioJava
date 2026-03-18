package tehtava6;

import java.util.ArrayList;

// Luokka
public class Hotelli {
    private String nimi;
    private ArrayList<Huone> huoneet;
    private ArrayList<Asiakas> asiakkaat;

    // Konstruktori
    public Hotelli(String nimi){
        setNimi(nimi);
        huoneet = new ArrayList<>();
        asiakkaat = new ArrayList<>();
    }

    // Getterit
    public String getNimi() {
        return nimi;
    }

    // Setterit
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    // Metodit
    public void lisaaHuone(Huone h){
        huoneet.add(h);
    }
    public void lisaaAsiakas(Asiakas a){
        asiakkaat.add(a);
    }
    public void tulostaHuoneet(){
        for(Huone h : huoneet){
            System.out.println(h.toString());
        }
    }
    public void tulostaAsiakas(){
        for(Asiakas a : asiakkaat){
            System.out.println(a.toString());
        }
    }
    public void asiakasLahtee(Asiakas a){
        for(Huone h : a.getVaraukset()){
            h.vapautaHuone();  // vapautetaan huone
        }
        a.getVaraukset().clear();  // tyhjennetään asiakkaan varaukset
    }
    public int vapaidenHuoneidenMaara(){
        int vapaat = 0;
        for(Huone h : huoneet){
            if(h.isOnVarattu() == false){
                vapaat++;
            }
        }
        return vapaat;
    }
    public Huone etsiVapaaHuone(String tyyppi){
        Huone vapaa = null;
        for(Huone h : huoneet){
            // Jos huoneen tyyppi on sama kuin tuo tyyppi mikä on tullut tähän ja se on vapaa niin se annetaan.
            if(h.getTyyppi().equals(tyyppi) &&  h.isOnVarattu() == false){
                vapaa = h;
                h.setOnVarattu(true);
                break;
            }
        }
        return vapaa;
    }
    public double laskeHotellintulot(int yot){
        int sum = 0;
        for(Huone h : huoneet){
            if(h.isOnVarattu() == true){
                sum += h.getHintaPerYo() * yot;
            }
        }
        return sum;
    }
}

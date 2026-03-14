package tehtava3;

import java.util.ArrayList;

public class Joukkue {
    public String nimi;
    public ArrayList<Pelaaja>pelaajat;

    public Joukkue(String nimi){
        this.nimi = nimi;
        this.pelaajat = new ArrayList<>();
    }

    public void lisaaPelaaja(Pelaaja p){
        this.pelaajat.add(p);
    }

    public int aktiivistenMaara(){
        int aktiiviset = 0;
        for(int i = 0; i < this.pelaajat.size(); i++){
            if(pelaajat.get(i).onAktiivinen == true){
                aktiiviset++;
            }
        }
        return aktiiviset;
    }

    public Pelaaja parasPelaaja(){
        Pelaaja paras = pelaajat.get(0);
        for(int i = 1; i < pelaajat.size(); i++){
            if(pelaajat.get(i).pisteet >  paras.pisteet){
                paras = pelaajat.get(i);
            }
        }
        return paras;
    }

    public int kokonaisPisteet(){
        int kokonaisPisteet = 0;
        for(int i = 0; i < pelaajat.size(); i++){
            kokonaisPisteet += pelaajat.get(i).pisteet;
        }
        return kokonaisPisteet;
    }
}

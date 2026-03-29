package tehtava8;

// Tehtävä 2: Aggregaatio — Koulu ja Opettaja

import java.util.ArrayList;

// Koulu luokka
public class Koulu {

    // private kentät
    private String nimi;
    private ArrayList<Opettaja> opettajat;

    // Konstruktori
    public Koulu(String nimi) {
        setNimi(nimi);
        opettajat = new ArrayList<>();
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
    public void lisaaOpettaja(Opettaja opettaja) {
        opettajat.add(opettaja);
    }
    public boolean poistaOpettaja(String nimi){
        for(int i = 0; i < opettajat.size(); i++){
            if(opettajat.get(i).getNimi().equals(nimi)){
                opettajat.remove(i);
                return true;
            }
        }
        return false;
    }
    public Opettaja etsiOpettaja(String nimi){
        Opettaja etsittävä = null;
        for(Opettaja opettaja : opettajat){
            if(opettaja.getNimi().equals(nimi)){
                etsittävä = opettaja;
                break;
            }
        }
        return etsittävä;
    }
    public void tulostaOpettajat(){
        for(Opettaja opettaja : opettajat){
            System.out.println(opettaja.toString());
        }
    }
    public int getOpettajamaara(){
        int sum = 0;
        for(Opettaja opettaja : opettajat){
            sum++;
        }
        return sum;
    }
}

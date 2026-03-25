package tehtava7;

import java.util.ArrayList;

public class Joukkue {
    private String nimi;
    private ArrayList<Pelaaja> pelaajat;

    public Joukkue(String nimi) {
        setNimi(nimi);
        pelaajat = new ArrayList<>();
    }

    // GETTERIT JA SETTERIT
    // NIMI
    public String getNimi() {
        return nimi;
    }
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    // METODIT
    public ArrayList<Pelaaja> getPelaajat() {
        return pelaajat;
    }
    public void lisaaPelaaja(Pelaaja pelaaja) {
        pelaajat.add(pelaaja);
    }
    public void poistaPelaaja(String nimi){
        for (int i = 0; i < pelaajat.size(); i++) {
            if (pelaajat.get(i).getNimi().equals(nimi)) {
                pelaajat.remove(i);
                break;
            }
        }
    }
    public Pelaaja etsiPelaaja(String nimi){
        for (Pelaaja pelaaja : pelaajat) {
            if (pelaaja.getNimi().equals(nimi)) {
                return pelaaja;
            }
        }
        return null;
    }
    public int getPelaajamaara(){
        return pelaajat.size();
    }
    public void tulostaKaikki(){
        for(Pelaaja pelaaja : pelaajat){
            System.out.println(pelaaja.toString());
        }
    }
}


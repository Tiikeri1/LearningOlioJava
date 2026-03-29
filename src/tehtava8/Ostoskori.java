package tehtava8;

// Tehtävä 3: Kompositio — Ostoskori

import java.util.ArrayList;

// Ostoskori luokka
public class Ostoskori {

    // private kentät
    private String omistaja;
    private ArrayList<OstosRivi> ostokset;

    // Konstruktori
    public Ostoskori(String omistaja){
        setOmistaja(omistaja);
        ostokset = new ArrayList<>();
    }

    // Getterit
    public String getOmistaja() {
        return omistaja;
    }

    // Setterit
    public void setOmistaja(String omistaja){
        this.omistaja = omistaja;
    }

    // Metodit
    public void lisaaTuote(String tuote, double hinta, int maara){
        ostokset.add(new OstosRivi(tuote, hinta, maara));
    }
    public void poistaTuote(String tuote){
        for(int i = 0; i < ostokset.size(); i++){
            if(ostokset.get(i).getTuote().equals(tuote)){
                ostokset.remove(i);
                break;
            }
        }
    }
    public double laskeYhteensa(){
        double sum = 0.0;
        for(int i = 0; i < ostokset.size(); i++){
            sum += ostokset.get(i).getRiviHinta();
        }
        return sum;
    }
    public void tulostaKori(){
        System.out.println(omistaja);
        for(OstosRivi rivi : ostokset){
            System.out.println(rivi.toString());
        }
        System.out.println("Yhteensä: " + laskeYhteensa() + "€");
    }
}

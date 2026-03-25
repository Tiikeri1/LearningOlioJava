package tehtava7;

import java.util.ArrayList;

public class Lasku {
    private String asiakas;
    private ArrayList<LaskuRivi> rivit;

    public Lasku(String asiakas){
        setAsiakas(asiakas);
        rivit = new ArrayList<>();
    }

    // GETTERIT JA SETTERIT
    // ASIAKAS
    public String getAsiakas(){
        return asiakas;
    }
    public void setAsiakas(String asiakas){
        this.asiakas = asiakas;
    }

    // METODIT
    public ArrayList<LaskuRivi> getLasku(){
        return rivit;
    }
    public void lisaaRivi(String tuote, double hinta, int maara){
        rivit.add(new LaskuRivi(tuote, hinta, maara));
    }
    public double laskeYhteensa(){
        double sum = 0;
        for(LaskuRivi rivi : rivit){
            sum += rivi.getRiviHinta();
        }
        return sum;
    }
    public void tulostaLasku(){
        System.out.println("Lasku asiakkaalle: " + asiakas);
        for(LaskuRivi rivi : rivit){
            System.out.println(rivi.toString());
        }
        System.out.println("Yhteensä: " + laskeYhteensa() + "€");
    }
}

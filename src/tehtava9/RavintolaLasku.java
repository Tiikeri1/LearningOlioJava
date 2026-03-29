package tehtava9;

// KOMPOSITIO

import java.util.ArrayList;

public class RavintolaLasku {
    private String poytanumero;
    private ArrayList<TilausRivi> tilausrivi;

    public RavintolaLasku(String poytanumero){
        setPoytanumero(poytanumero);
        tilausrivi = new ArrayList<TilausRivi>();
    }
    public String getPoytanumero(){
        return poytanumero;
    }
    public void setPoytanumero(String poytanumero){
        this.poytanumero = poytanumero;
    }

    public void lisaaAnnos(String annos, double hinta, int maara){
        tilausrivi.add(new TilausRivi(annos, hinta, maara));
    }
    public void poistaAnnos(String annos){
        for(int i = 0; i < tilausrivi.size(); i++){
            if(tilausrivi.get(i).getAnnos().equals(annos)){
                tilausrivi.remove(tilausrivi.get(i));
                break;
            }
        }
    }
    public double laskeYhteensa(){
        double sum = 0.0;
        for(int i = 0; i < tilausrivi.size(); i++){
            sum += tilausrivi.get(i).getRiviHinta();
        }
        return sum;
    }
    public double laskeTip(int prosentti){
        double tip = laskeYhteensa() * prosentti / 100;
        return tip;
    }
    public void tulostaLasku(){
        System.out.println("Pöytä: " + getPoytanumero());
        for(TilausRivi tilausrivi : tilausrivi){
            System.out.println(tilausrivi.toString());
        }
        System.out.println("Yhteensä: " + laskeYhteensa() + "€");
    }
}

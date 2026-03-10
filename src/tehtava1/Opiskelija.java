package tehtava1;

import java.util.ArrayList;

public class Opiskelija {
    public String nimi;
    public String opiskelijanumero;
    public ArrayList<Integer> arvosanat;

    public Opiskelija(String nimi, String opiskelijanumero){
        this.nimi = nimi;
        this.opiskelijanumero = opiskelijanumero;
        arvosanat = new ArrayList<>();
    }
    public void lisaaArvosana(int arvosana){
        arvosanat.add(arvosana);
    }
    public double keskiarvo(){
        double sum = 0.0;
        if(arvosanat.size() > 0) {
            for (int i = 0; i < arvosanat.size(); i++) {
                sum += arvosanat.get(i);
            }
            double keskiarvo = (sum / arvosanat.size());
            return keskiarvo;
        }
        else{
            return 0.0;
        }
    }
    public String toString(){
        return nimi + " (" + opiskelijanumero + ") - keskiarvo: " + keskiarvo();
    }
}

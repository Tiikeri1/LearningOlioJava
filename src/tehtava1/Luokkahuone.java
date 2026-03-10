package tehtava1;

import java.util.ArrayList;

public class Luokkahuone {
    public ArrayList<Opiskelija> opiskelijat = new ArrayList<>();
    public String nimi;

    public Luokkahuone(String nimi){
        this.nimi = nimi;
    }
    public void lisaaOpiskelija(Opiskelija o){
        opiskelijat.add(o);
    }
    public int opiskelijamaara(){
        return opiskelijat.size();
    }
    public Opiskelija parasOpiskelija(){
        Opiskelija paras = opiskelijat.get(0);
        for(int i = 0; i < opiskelijat.size(); i++){
            if(opiskelijat.get(i).keskiarvo() > paras.keskiarvo()){
                paras = opiskelijat.get(i);
            }
        }
        return paras;
    }
}
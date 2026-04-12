package tehtava10;

import java.util.ArrayList;

public class TyontekijaMain {
    public static void main(String[] args) {
        ArrayList<Tyontekija> tyontekijat = new ArrayList();

        Provisiotyontekija provisiotyontekija = new Provisiotyontekija("Markku", 2200.0, 165.0, 20.0);
        Provisiotyontekija provisiotyontekija2 = new Provisiotyontekija("Maija", 2200.0, 202.0, 20.0);
        Harjoittelija harjoittelija = new Harjoittelija("Olli", 2000.0, 2);
        Harjoittelija harjoittelija2 = new Harjoittelija("Veeti", 2100.0, 6);

        tyontekijat.add(provisiotyontekija);
        tyontekijat.add(provisiotyontekija2);
        tyontekijat.add(harjoittelija);
        tyontekijat.add(harjoittelija2);

        double sum = 0;
        for(Tyontekija t : tyontekijat){
            System.out.println(t.toString());
            sum += t.laskePalkka();
        }
        System.out.println("Työntekijöiden palkkojen summa yhteensä: " + sum + "€");
    }
}
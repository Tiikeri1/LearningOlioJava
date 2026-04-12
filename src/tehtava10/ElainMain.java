package tehtava10;

import java.util.ArrayList;

public class ElainMain {
    public static void main(String[] args) {
        ArrayList<Elain> elaimet = new ArrayList();
        Kala kala = new Kala("Hauki", 2, "makeavesi");
        Kala kala2 = new Kala("Hai", 10, "merivesi");
        Lintu lintu = new Lintu("Merikotka", 2, 1.8);
        Lintu lintu2 = new Lintu("Huuhkaja", 5, 167.0);

        elaimet.add(kala);
        elaimet.add(kala2);
        elaimet.add(lintu);
        elaimet.add(lintu2);

        for(Elain elain : elaimet) {
            System.out.println(elain.toString() + " " + elain.teeAani());
        }
    }
}

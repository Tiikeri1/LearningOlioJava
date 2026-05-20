package tehtava11;

import java.util.ArrayList;

public class AjoneuvoMain {
    public static void main(String[] args) {
        ArrayList<Ajoneuvo> ajoneuvot = new ArrayList<>();
        Polkupyora polkupyora = new Polkupyora("Trek", 30, 21);
        Polkupyora polkupyora2 = new Polkupyora("Solifer", 20, 7);
        Sahkoauto sahkoauto = new Sahkoauto("Tesla", 200, 75);
        Sahkoauto sahkoauto2 = new Sahkoauto("Hyundai", 180, 65);

        ajoneuvot.add(polkupyora);
        ajoneuvot.add(polkupyora2);
        ajoneuvot.add(sahkoauto);
        ajoneuvot.add(sahkoauto2);

        for (Ajoneuvo ajoneuvo : ajoneuvot) {
            System.out.println(ajoneuvo.toString());
            System.out.println(ajoneuvo.kulkutapa());
            System.out.println(ajoneuvo.laskeToimintamatka());
            System.out.println();
        }
    }
}

package tehtava10;

import java.util.ArrayList;

public class KulkuneuvoMain {
    public static void main(String[] args) {
        ArrayList<Kulkuneuvo> kulkuneuvot = new ArrayList();

        Auto auto = new Auto("Matti", 200, "bensiini");
        Auto auto2 = new Auto("Martta", 170, "diesel");
        Polkupyora polkupyora = new Polkupyora("Maija", 25, 7);
        Polkupyora polkupyora2 = new Polkupyora("Otto", 30, 21);

        kulkuneuvot.add(auto);
        kulkuneuvot.add(auto2);
        kulkuneuvot.add(polkupyora);
        kulkuneuvot.add(polkupyora2);

        for(Kulkuneuvo kulkuneuvo : kulkuneuvot){
            System.out.println(kulkuneuvo.toString() + " " + kulkuneuvo.kulkutapa());
        }
    }
}

package tehtava1;

import javax.annotation.processing.SupportedSourceVersion;
import java.lang.management.OperatingSystemMXBean;

public class KouluMain {
    public static void main(String[] args) {
        Opiskelija opiskelija = new Opiskelija("Ossi Opiskelija", "26204");
        Opiskelija opiskelija2 = new Opiskelija("Kaarlo Kuosmanen", "26206");
        Opiskelija opiskelija3 = new Opiskelija("Teuvo Teräväinen", "26270");

        opiskelija.lisaaArvosana(3);
        opiskelija2.lisaaArvosana(4);
        opiskelija3.lisaaArvosana(2);

        Luokkahuone luokkahuone = new Luokkahuone("A");

        luokkahuone.lisaaOpiskelija(opiskelija);
        luokkahuone.lisaaOpiskelija(opiskelija2);
        luokkahuone.lisaaOpiskelija(opiskelija3);

        System.out.println(opiskelija.toString());
        System.out.println(opiskelija2.toString());
        System.out.println(opiskelija3.toString());
        System.out.println("Paras opiskelija on " + luokkahuone.parasOpiskelija().nimi + " keskiarvolla " + luokkahuone.parasOpiskelija().keskiarvo());
    }
}

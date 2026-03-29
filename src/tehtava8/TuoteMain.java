package tehtava8;

// Tehtävä 1: Static-laskuri ja keskiarvo

public class TuoteMain {

    // Main: Luo 4 tuotetta eri hinnoilla. Tulosta määrä ja keskihinta.

    public static void main(String[] args) {
        Tuote tuote = new Tuote("Maito", 0.79);
        Tuote tuote2 = new Tuote("Suklaa", 3.99);
        Tuote tuote3 = new Tuote("Omena", 0.41);
        Tuote tuote4 = new Tuote("Banaani", 0.25);

        System.out.println("Tuotteiden määrä - " + Tuote.getLaskuri());
        System.out.println("Tuotteiden keski hinta - " + Tuote.getKeskiHinta() + "€");
    }
}

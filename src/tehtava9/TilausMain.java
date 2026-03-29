package tehtava9;

// Main: Luo kaksi pöytää, lisää annoksia, tulosta laskut ja laske 15% tip molemmille.

public class TilausMain {
    public static void main(String[] args) {
        RavintolaLasku ravintolaLasku = new RavintolaLasku("1");
        RavintolaLasku ravintolaLasku2 = new RavintolaLasku("2");

        ravintolaLasku.lisaaAnnos("Pihvi", 12.40, 1);
        ravintolaLasku.lisaaAnnos("Limppari", 2.4, 1);

        ravintolaLasku2.lisaaAnnos("Kalakeitto", 9.90, 1);
        ravintolaLasku2.lisaaAnnos("Maito", 2.00, 2);

        ravintolaLasku.tulostaLasku();
        System.out.println("");
        ravintolaLasku2.tulostaLasku();
    }
}

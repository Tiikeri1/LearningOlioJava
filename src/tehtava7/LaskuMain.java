package tehtava7;

public class LaskuMain {
    public static void main(String[] args) {
        Lasku lasku = new Lasku("Matti");
        Lasku lasku2 = new Lasku("Maija");

        lasku.lisaaRivi("Kahvi", 4.49, 2);
        lasku.lisaaRivi("Maito", 1.49, 1);

        lasku2.lisaaRivi("Kahvi", 4.49, 1);
        lasku2.lisaaRivi("Pulla", 2.20, 1);

        lasku.tulostaLasku();
        System.out.println("");
        lasku2.tulostaLasku();
    }
}

package tehtava4;

public class KauppaMain {
    public static void main(String[] args) {
        Tuote tuote1 = new Tuote("Maito", 0.79);
        Tuote tuote2 = new Tuote("Maito", 0.79, 30);
        System.out.println("Tuote normi hinnalla: " + tuote2.toString());
        System.out.println("Tuotteen alennettu hinta: " + tuote2.alennettuHinta() + "€");
    }
}
package tehtava8;

// Main: Luo kaksi ostoskoria, lisää tuotteita, poista yksi tuote yhdestä korista ja tulosta molemmat.

public class OstoksetMain {
    public static void main(String[] args) {
        Ostoskori ostoskori = new Ostoskori("Matti Meikäläinen");
        Ostoskori ostoskori2 = new Ostoskori("Maija Meikäläinen");

        ostoskori.lisaaTuote("Maito", 0.79, 2);
        ostoskori.lisaaTuote("Suklaa", 4.09, 1);

        ostoskori2.lisaaTuote("Omena", 0.24, 2);
        ostoskori2.lisaaTuote("Kaurahiutale", 0.37, 2);

        ostoskori.poistaTuote("Maito");

        ostoskori.tulostaKori();
        System.out.println("");
        ostoskori2.tulostaKori();
    }
}

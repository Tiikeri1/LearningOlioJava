package tehtava3;

public class JoukkueMain {
    public static void main(String[] args) {
        Joukkue joukkue = new Joukkue("FC BARCELONA");

        Pelaaja pelaaja = new Pelaaja("Lamine Yamal");
        Pelaaja pelaaja2 = new Pelaaja("Hammas Kor");
        Pelaaja pelaaja3 = new Pelaaja("Sk");
        Pelaaja pelaaja4 = new Pelaaja("Matti Meikäläinen");

        joukkue.lisaaPelaaja(pelaaja);
        joukkue.lisaaPelaaja(pelaaja2);
        joukkue.lisaaPelaaja(pelaaja3);
        joukkue.lisaaPelaaja(pelaaja4);

        pelaaja.lisaaPisteet(1);
        pelaaja2.lisaaPisteet(2);
        pelaaja3.lisaaPisteet(2);
        pelaaja4.lisaaPisteet(1);

        pelaaja3.poistaAktiivisuus();

        System.out.println("Aktiiviset pelaajat: " + joukkue.aktiivistenMaara());
        System.out.println("Paras pelaaja: " + joukkue.parasPelaaja() + " pisteet: "+joukkue.parasPelaaja().pisteet);
        System.out.println("Kokonaispisteet: " + joukkue.kokonaisPisteet());
    }
}

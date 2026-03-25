package tehtava7;

public class JoukkueMain {
    public static void main(String[] args) {
        Joukkue joukkue = new Joukkue("FCB");
        Pelaaja pelaaja = new Pelaaja("Marcus Rashford", "hyökkääjä");
        Pelaaja pelaaja2 = new Pelaaja("Marc Bernal", "keskikenttä");
        Pelaaja pelaaja3 = new Pelaaja("Xavi Espart", "puolustaja");
        Pelaaja pelaaja4 = new Pelaaja("Diego Kochen", "maalivahti");

        joukkue.lisaaPelaaja(pelaaja);
        joukkue.lisaaPelaaja(pelaaja2);
        joukkue.lisaaPelaaja(pelaaja3);
        joukkue.lisaaPelaaja(pelaaja4);

        joukkue.tulostaKaikki();
        joukkue.poistaPelaaja("Marc Bernal");
        System.out.println("\n" + joukkue.etsiPelaaja("Xavi Espart") + "\n");
        joukkue.tulostaKaikki();
    }
}

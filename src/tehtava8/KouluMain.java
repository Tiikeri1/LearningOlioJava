package tehtava8;

// Tehtävä 2: Aggregaatio — Koulu ja Opettaja

public class KouluMain {

    // Main: Luo koulu ja 4 opettajaa. Tulosta kaikki. Poista yksi. Etsi yksi nimellä ja tulosta.

    public static void main(String[] args) {
        Koulu koulu = new Koulu("Kirkkokadun koulu");

        Opettaja opettaja = new Opettaja("Ritva Hietala", "Historia");
        Opettaja opettaja2 = new Opettaja("Anna Shirley", "Äidinkieli");
        Opettaja opettaja3 = new Opettaja("Matti Pesola", "Matematiikka");
        Opettaja opettaja4 = new Opettaja("Anna-Mari Kivari", "Kuvaamataito");

        koulu.lisaaOpettaja(opettaja);
        koulu.lisaaOpettaja(opettaja2);
        koulu.lisaaOpettaja(opettaja3);
        koulu.lisaaOpettaja(opettaja4);

        koulu.tulostaOpettajat();
        System.out.println("");

        koulu.poistaOpettaja("Anna Shirley");
        System.out.println(koulu.etsiOpettaja("Matti Pesola"));
        System.out.println("");
        koulu.tulostaOpettajat();
    }
}

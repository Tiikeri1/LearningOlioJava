package tehtava2;

public class KauppaMain {
    static void main(String[] args){
        Kauppa kauppa = new Kauppa("S Market");

        Tuote maito = new Tuote("Maito", 0.89, 23);
        Tuote makkara = new Tuote("Makkara", 2.19, 12);
        Tuote porkkana = new Tuote("Porkkana", 0.13, 23);
        Tuote hillo = new Tuote("Hillo", 4.10, 23);

        kauppa.lisaaTuote(maito);
        kauppa.lisaaTuote(makkara);
        kauppa.lisaaTuote(porkkana);
        kauppa.lisaaTuote(hillo);

        kauppa.tulostaVarastoTilanne();
        System.out.println("Halvin tuote: " + kauppa.halvinTuote().nimi);
        System.out.println("Varaston arvo: " + kauppa.varastonArvo() + "€");

        System.out.println("");
        System.out.println("Vähennetään maidon määrää kahdella ja katsotaan varaston tilanne sekä halvin tuote ja varaston arvo.");
        maito.vahennaMaaraa(2);
        kauppa.tulostaVarastoTilanne();
        System.out.println("Halvin tuote: " + kauppa.halvinTuote().nimi);
        System.out.println("Varaston arvo: " + kauppa.varastonArvo() + "€");

        System.out.println("");
        System.out.println("Poistetaan porkkana ja katsotaan varaston tilanne sekä halvin tuote ja varaston arvo.");
        kauppa.poistaTuote(porkkana);
        kauppa.tulostaVarastoTilanne();
        System.out.println("Halvin tuote: " + kauppa.halvinTuote().nimi);
        System.out.println("Varaston arvo: " + kauppa.varastonArvo() + "€");
    }
}
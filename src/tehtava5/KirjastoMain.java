package tehtava5;

public class KirjastoMain {
    public static void main(String[] args) {
        boolean onnistui;

        // Tehdään kirjasto
        Kirjasto kirjasto = new Kirjasto("Kuopion kirjasto");

        // Tehdään 5 kirjaa
        Kirja kirja1 = new Kirja("Maantievirus matkalla pohjoiseen", "Stephen King", 2002);
        Kirja kirja2 = new Kirja("Pianonvirittäjä", "Stefan Tegenfalk", 2017);
        Kirja kirja3 = new Kirja("Älä käännä selkääsi", "Pernilla Ericson", 2018);
        Kirja kirja4 = new Kirja("Kuolema niilillä", "Agatha Christie", 1937);
        Kirja kirja5 = new Kirja("Paikka vapaana", "J.K. Rowling", 2012);

        // Listätään kirjastoon kirjat
        kirjasto.lisaaKirja(kirja1);
        kirjasto.lisaaKirja(kirja2);
        kirjasto.lisaaKirja(kirja3);
        kirjasto.lisaaKirja(kirja4);
        kirjasto.lisaaKirja(kirja5);

        // Tulostetaan kaikki kirjat
        System.out.println("Kirjaston kaikki kirjat: ");
        kirjasto.tulostaKaikki();
        System.out.println("");

        // Lainataan kaikki kirjat ja tulostetaan kaikki sen jälkeen
        kirja3.lainaa();
        kirja2.lainaa();
        kirja5.lainaa();
        System.out.println("Kirjat kun 3 lainassa: ");
        kirjasto.tulostaKaikki();
        System.out.println("");

        // Palautetaan 1 kirja ja tulostetaan kaikki sen jälkeen
        kirja2.palauta();
        System.out.println("Kirjat kun 1 palautetaan: ");
        kirjasto.tulostaKaikki();
        System.out.println("");

        // Yritetään lainata kirja joka on jo lainassa - jos epäonnistuu tulostetaan "Lainaus epäonnistui"
        onnistui = kirja3.lainaa();
        if(onnistui == true) {
            System.out.println("Lainaus onnistui");
        }
        else {
            System.out.println("Lainaus epäonnistui, kirja on jo lainassa");
        }
        System.out.println("");

        // Etsitään kirja nimellä ja tulostetaan sen tiedot
        System.out.println(kirjasto.etsiKirja("Paikka vapaana").toString());
        System.out.println("");

        // Tulostetaan saatavilla ja lainassa olevien määrät
        System.out.println("Saatavilla olevat kirjat: " + kirjasto.saatavilla() + "kpl");
        System.out.println("Lainassa olevat kirjat: " + kirjasto.lainassa() + "kpl");
    }
}

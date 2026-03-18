package tehtava6;

// Luokka
public class HotelliMain {
    public static void main(String[] args) {
        // Luodaan hotelli, 6 huonetta ja 3 asiakasta
        Hotelli hotelli = new Hotelli("Hotel Kuopio");
        Huone huone = new Huone(1, "Standard Single", 55.0);
        Huone huone2 = new Huone(2, "Standard Double", 55.0);
        Huone huone3 = new Huone(3, "Superior", 66.0);
        Huone huone4 = new Huone(4, "Deluxe", 77.0);
        Huone huone5 = new Huone(5, "Junior-sviitti", 90.0);
        Huone huone6 = new Huone(6, "Sviitti", 100.0);
        hotelli.lisaaHuone(huone);
        hotelli.lisaaHuone(huone2);
        hotelli.lisaaHuone(huone3);
        hotelli.lisaaHuone(huone4);
        hotelli.lisaaHuone(huone5);
        hotelli.lisaaHuone(huone6);
        Asiakas asiakas = new Asiakas("Aada Virtanen", "044 933 1120");
        Asiakas asiakas2 = new Asiakas("Leo Laine", "050 975 1750");
        Asiakas asiakas3 = new Asiakas("Väinö Heikkinen", "040 124 6457");

        // Varataan jokaiselle asiakkalle huone etsiVapaaHuone()-metodilla ja tulostetaan hotellin tilanne.
        asiakas.lisaaVaraus(hotelli.etsiVapaaHuone("Standard Single"));
        asiakas2.lisaaVaraus(hotelli.etsiVapaaHuone("Sviitti"));
        asiakas3.lisaaVaraus(hotelli.etsiVapaaHuone("Superior"));
        hotelli.tulostaHuoneet();

        System.out.println("");

        // Yksi asiakas lähtee vapautetaan huone ja päivitetään tilanne
        hotelli.asiakasLahtee(asiakas);
        hotelli.tulostaHuoneet();

        System.out.println("");

        // Tulostetaan hotellin kokonaistulot 3 yöltä
        System.out.println("Hotellin tulot kolmelta yöltä: " + hotelli.laskeHotellintulot(3) + "€");
    }
}

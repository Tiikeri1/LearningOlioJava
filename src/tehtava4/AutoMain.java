package tehtava4;

public class AutoMain {
    public static void main(String[] args) {
        Auto auto = new Auto("BMW", "M5", 2008);
        System.out.println(auto.toString());

        // Kiihdytetään
        auto.kiihdyta(80);
        System.out.println(auto.toString());

        // Hidastetaan
        auto.jarruta(20);
        System.out.println(auto.toString());

        // Yritetään hidastaa negatiivisen puolelle
        auto.jarruta(70);
        System.out.println(auto.toString());
    }
}

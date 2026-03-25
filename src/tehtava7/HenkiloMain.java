package tehtava7;

public class HenkiloMain {
    public static void main(String[] args) {
        System.out.println(Henkilo.getLaskuri());
        Henkilo henkilo = new Henkilo("Matti Meikäläinen", 25);
        Henkilo henkilo2 = new Henkilo("Teuvo Teräväinen", 88);
        Henkilo henkilo3 = new Henkilo("Aleksis Kivi", 55);
        Henkilo henkilo4 = new Henkilo("Veeti Tikkanen", 22);
        System.out.println(Henkilo.getLaskuri());
    }
}
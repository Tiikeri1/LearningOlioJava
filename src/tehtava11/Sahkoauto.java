package tehtava11;

public class Sahkoauto extends Ajoneuvo {
    private int akkukapasiteetti;

    public Sahkoauto(String merkki, int nopeus, int akkukapasiteetti) {
        super(merkki, nopeus);
        setakkukapasiteetti(akkukapasiteetti);
    }

    public int getakkukapasiteetti() {
        return akkukapasiteetti;
    }
    public void setakkukapasiteetti(int akkukapasiteetti) {
        this.akkukapasiteetti = akkukapasiteetti;
    }

    @Override
    public String kulkutapa() {
        return "Sähkömoottori";
    }
    @Override
    public double laskeToimintamatka() {
        return getakkukapasiteetti() * 6.5;
    }
    @Override
    public String toString(){
        return "Sähköauto [merkki=" + getMerkki() + ", nopeus=" + getNopeus() + ", akku=" +  getakkukapasiteetti() + "kWh]";
    }
}

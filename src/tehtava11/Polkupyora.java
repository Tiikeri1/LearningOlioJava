package tehtava11;

public class Polkupyora extends Ajoneuvo {
    private int vaihteet;

    public Polkupyora(String merkki, int nopeus, int vaihteet) {
        super(merkki,nopeus);
        setVaihteet(vaihteet);
    }

    public int  getVaihteet() {
        return vaihteet;
    }
    public void setVaihteet(int vaihteet) {
        this.vaihteet = vaihteet;
    }

    @Override
    public double laskeToimintamatka() {
        return vaihteet * 15.0;
    }
    @Override
    public String kulkutapa() {
        return "Poljinvoima";
    }
    @Override
    public String toString(){
        return "Polkupyörä [merkki=" + getMerkki() + ", nopeus=" + getNopeus() + ", vaihteet=" +  getVaihteet() + "]";
    }
}

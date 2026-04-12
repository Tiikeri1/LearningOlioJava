package tehtava10;

public class Polkupyora extends Kulkuneuvo{
    private int vaihteet;

    public Polkupyora(String omistaja, int maksiminopeus, int vaihteet){
        super(omistaja,maksiminopeus);
        setVaihteet(vaihteet);
    }

    public int getVaihteet() {
        return vaihteet;
    }
    public void setVaihteet(int vaihteet) {
        this.vaihteet = vaihteet;
    }

    @Override
    public String kulkutapa(){
        return "Polkemalla";
    }
    @Override
    public String toString(){
        return "Polkupyora [omistaja=" + getOmistaja() + ", maksiminopeus=" + getMaksiminopeus() + ", vaihteet=" + vaihteet + "]";
    }
}

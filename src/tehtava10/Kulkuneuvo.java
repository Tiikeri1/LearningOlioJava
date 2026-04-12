package tehtava10;

public class Kulkuneuvo {
    private String omistaja;
    private int maksiminopeus;

    public Kulkuneuvo(String omistaja, int maksiminopeus) {
        setOmistaja(omistaja);
        setMaksiminopeus(maksiminopeus);
    }

    public String getOmistaja() {
        return omistaja;
    }
    public void setOmistaja(String omistaja) {
        this.omistaja = omistaja;
    }
    public int getMaksiminopeus() {
        return maksiminopeus;
    }
    public void setMaksiminopeus(int maksiminopeus) {
        if(maksiminopeus > 0)
            this.maksiminopeus = maksiminopeus;
    }

    public String kulkutapa(){
        return "Tuntematon";
    }
    public String toString(){
        return "Kulkuneuvo [omistaja=" + omistaja + ", maksiminopeus=" + maksiminopeus+"]";
    }
}

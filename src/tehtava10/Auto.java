package tehtava10;

public class Auto extends Kulkuneuvo {
    private String polttoaine;

    public Auto(String omistaja, int maksiminopeus, String polttoaine){
        super(omistaja, maksiminopeus);
        setPolttoaine(polttoaine);
    }

    public String getPolttoaine() {
        return polttoaine;
    }
    public void setPolttoaine(String polttoaine) {
        this.polttoaine = polttoaine;
    }

    @Override
    public String kulkutapa(){
        return "Moottorilla";
    }
    @Override
    public String toString(){
        return "Auto [omistaja=" + getOmistaja() + ", maksiminopeus=" + getMaksiminopeus() + ", polttoaine=" + polttoaine + "]";
    }
}

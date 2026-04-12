package tehtava10;

public class Provisiotyontekija extends Tyontekija{
    private double myynti;
    private double provisioProsentti;

    public Provisiotyontekija(String nimi, double peruspalkka, double myynti, double provisioProsentti){
        super(nimi, peruspalkka);
        setMyynti(myynti);
        setProvisioProsentti(provisioProsentti);
    }

    public double getMyynti() {
        return myynti;
    }
    public void setMyynti(double myynti) {
        this.myynti = myynti;
    }
    public double getProvisioProsentti() {
        return provisioProsentti;
    }
    public void setProvisioProsentti(double provisioProsentti) {
        this.provisioProsentti = provisioProsentti;
    }

    @Override
    public double laskePalkka(){
        return getPeruspalkka() + myynti * provisioProsentti / 100;
    }
    @Override
    public String toString(){
        return getNimi() + " - palkka: " + laskePalkka() + " (provisio: " + (laskePalkka() - getPeruspalkka()) + "€)";
    }
}

package tehtava10;

public class Harjoittelija extends Tyontekija{
    private int kuukaudet;

    public Harjoittelija(String nimi, double peruspalkka, int kuukaudet){
        super(nimi, peruspalkka);
        setKuukaudet(kuukaudet);
    }

    public int getKuukaudet() {
        return kuukaudet;
    }
    public void setKuukaudet(int kuukaudet) {
        if(kuukaudet > 0)
            this.kuukaudet = kuukaudet;
    }

    @Override
    public double laskePalkka(){
        return getPeruspalkka() * 0.7;
    }
    @Override
    public String toString(){
        return getNimi() + " - harjoittelija (" + kuukaudet + "kk) - palkka: " + laskePalkka() + "€";
    }
}

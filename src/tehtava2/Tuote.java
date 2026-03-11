package tehtava2;

public class Tuote {
    public String nimi;
    public double hinta;
    public int maara;

    public Tuote(String nimi, double hinta, int maara) {
        this.nimi = nimi;
        this.hinta = hinta;
        this.maara = maara;
    }

    public boolean onVarastossa(){
        if(maara > 0){
            return true;
        }
        else{
            return false;
        }
    }

    public String toString(){
        return nimi + " - " + hinta + "€ (" + maara + " kpl)";
    }

    public void vahennaMaaraa(int maara){
        if(this.maara > maara){
            this.maara -= maara;
        }
    }
}

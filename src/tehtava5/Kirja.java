package tehtava5;

// Class
public class Kirja {
    private String nimi;
    private String kirjailija;
    private int vuosi;
    private boolean onLainassa;

    // Konstruktori
    public Kirja(String nimi, String kirjailija, int vuosi){
        setNimi(nimi);
        setKirjailija(kirjailija);
        if(vuosi > 1400 && vuosi < 2026){
            setVuosi(vuosi);
        }
        onLainassa = false;
    }

    // Getterit
    public String getNimi() {
        return nimi;
    }
    public String getKirjailija() {
        return kirjailija;
    }
    public int getVuosi() {
        return vuosi;
    }
    public boolean onLainassa() {
        return onLainassa;
    }

    // Setterit
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
    public void setKirjailija(String kirjailija) {
        this.kirjailija = kirjailija;
    }
    public void setVuosi(int vuosi) {
        if(vuosi > 1400 && vuosi < 2026){
            this.vuosi = vuosi;
        }
    }
    public void setOnLainassa(boolean onLainassa) {
        this.onLainassa = onLainassa;
    }

    // Metodit
    public boolean lainaa(){
        if(onLainassa == true){
            return false;
        }
        onLainassa = true;
        return true;
    }
    public boolean palauta(){
        if(onLainassa == true){
            onLainassa = false;
            return true;
        }
        return false;
    }

    public String toString(){
        String lainassa;
        if(onLainassa == false){
            lainassa = "saatavilla";
        }
        else{
            lainassa = "lainassa";
        }
        return nimi + " - " + kirjailija + " (" + vuosi + ") [" + lainassa + "]";
    }
}

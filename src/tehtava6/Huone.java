package tehtava6;

// Luokka
public class Huone {
    private int huonenumero;
    private String tyyppi;
    private double hintaPerYo;
    private boolean onVarattu;

    // Konstruktori
    public Huone(int huonenumero, String tyyppi, double hintaPerYo) {
        setHuonenumero(huonenumero);
        setTyyppi(tyyppi);
        if(hintaPerYo > 0) {
            setHintaPerYo(hintaPerYo);
        }
        onVarattu = false;
    }

    // Getterit
    public int getHuonenumero() {
        return huonenumero;
    }

    public String getTyyppi() {
        return tyyppi;
    }

    public double getHintaPerYo() {
        return hintaPerYo;
    }

    public boolean isOnVarattu() {
        return onVarattu;
    }

    // Setterit
    public void setHuonenumero(int huonenumero) {
        this.huonenumero = huonenumero;
    }
    public void setTyyppi(String tyyppi) {
        this.tyyppi = tyyppi;
    }
    public void setHintaPerYo(double hintaPerYo) {
        if(hintaPerYo > 0) {
            this.hintaPerYo = hintaPerYo;
        }
    }
    public void setOnVarattu(boolean onVarattu) {
        this.onVarattu = onVarattu;
    }

    // Metodit
    public boolean varaa(){
        if(onVarattu){
            return false;
        }
        onVarattu = true;
        return true;
    }

    public boolean vapautaHuone(){
        if(!onVarattu){
            return false;
        }
        onVarattu = false;
        return false;
    }

    public String toString(){
        String str = "vapaa";
        if(onVarattu == true){
            str = "varattu";
        }
        return "Huone " + huonenumero + " - " + tyyppi + " - " + hintaPerYo + "€/yö [" + str + "]";
    }
}

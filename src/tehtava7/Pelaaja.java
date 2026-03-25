package tehtava7;

public class Pelaaja {
    private String nimi;
    private String asema;

    public Pelaaja(String nimi, String asema){
        setNimi(nimi);
        setAsema(asema);
    }

    // GETTERIT JA SETTERIT
    // NIMI
    public String getNimi() {
        return nimi;
    }
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    // ASEMA
    public String getAsema() {
        return asema;
    }
    public void setAsema(String asema) {
        this.asema = asema;
    }

    // METODIT
    public String toString(){
        return nimi + " - " + asema;
    }
}
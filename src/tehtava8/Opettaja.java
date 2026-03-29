package tehtava8;

// Tehtävä 2: Aggregaatio — Koulu ja Opettaja


// Opettaja luokka
public class Opettaja {

    // private kentät
    private String nimi;
    private String aine;

    // Konstruktori
    public Opettaja(String nimi, String aine) {
        setNimi(nimi);
        setAine(aine);
    }

    // Getterit
    public String getNimi() {
        return nimi;
    }
    public String getAine() {
        return aine;
    }

    // Setterit
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
    public void setAine(String aine) {
        this.aine = aine;
    }

    // Metodit
    public String toString() {
        return nimi + " - " + aine;
    }
}

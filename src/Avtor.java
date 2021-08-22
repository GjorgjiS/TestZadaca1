public class Avtor extends Kniga {
    private String ime;
    private String prezime;
    private int god_raganje;

    public Avtor() {
    }

    public Avtor(String ime, String prezime, int god_raganje) {
        this.ime = ime;
        this.prezime = prezime;
        this.god_raganje = god_raganje;
    }

    public Avtor(String naslov, String ISBN, int godina_izdavanje, String ime, String prezime, int god_raganje) {
        super(naslov, ISBN, godina_izdavanje);
        this.ime = ime;
        this.prezime = prezime;
        this.god_raganje = god_raganje;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getGod_raganje() {
        return god_raganje;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setGod_raganje(int god_raganje) {
        this.god_raganje = god_raganje;
    }
}

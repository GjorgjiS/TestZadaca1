public class Kniga {
    private String naslov;
    private String ISBN;
    private int godina_izdavanje;

    public Kniga() {
    }

    public Kniga(String naslov, String ISBN, int godina_izdavanje) {
        this.naslov = naslov;
        this.ISBN = ISBN;
        this.godina_izdavanje = godina_izdavanje;
    }

    public String getNaslov() {
        return naslov;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getGodina_izdavanje() {
        return godina_izdavanje;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setGodina_izdavanje(int godina_izdavanje) {
        this.godina_izdavanje = godina_izdavanje;
    }

    @Override
    public String toString() {
        return "Kniga{" +
                "naslov='" + naslov + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", godina_izdavanje=" + godina_izdavanje +
                '}';
    }
}

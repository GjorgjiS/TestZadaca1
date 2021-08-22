public class PrintCopy extends Kniga {
    private int br_strani;
    private float tezina;

    public PrintCopy() {
    }

    public PrintCopy(int br_strani, float tezina) {
        this.br_strani = br_strani;
        this.tezina = tezina;
    }

    public PrintCopy(String naslov, String ISBN, int godina_izdavanje, int br_strani, float tezina) {
        super(naslov, ISBN, godina_izdavanje);
        this.br_strani = br_strani;
        this.tezina = tezina;
    }

    public int getBr_strani() {
        return br_strani;
    }

    public float getTezina() {
        return tezina;
    }

    public void setBr_strani(int br_strani) {
        this.br_strani = br_strani;
    }

    public void setTezina(float tezina) {
        this.tezina = tezina;
    }
}

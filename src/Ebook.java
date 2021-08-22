
public class Ebook extends Kniga {

    enum ebook {
        EPUB,
        PDF,
        HTML5
    }
    private int golemina_MB;
    private ebook format;

    public Ebook() {
    }

    public Ebook(int golemina_MB, ebook format) {
        this.golemina_MB = golemina_MB;
        this.format = format;
    }

    public Ebook(String naslov, String ISBN, int godina_izdavanje, int golemina_MB, ebook format) {
        super(naslov, ISBN, godina_izdavanje);
        this.golemina_MB = golemina_MB;
        this.format = format;
    }

    public int getGolemina_MB() {
        return golemina_MB;
    }

    public ebook getFormat() {
        return format;
    }

    public void setGolemina_MB(int golemina_MB) {
        this.golemina_MB = golemina_MB;
    }

    public void setFormat(ebook format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "Ebook{" +
                "golemina_MB=" + golemina_MB +
                ", format=" + format + "KNIGA"+ super.toString()+
                '}';
    }
}

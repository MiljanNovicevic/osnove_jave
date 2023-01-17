package d16_01_2023;

public class Igrac extends Osoba {

    private String brojIgraca;
    private String pozicija;
    private boolean kapiten;

    public Igrac(String imeIPrezime, String jmbg, int godRodjenja, String brojIgraca, String pozicija, boolean kapiten) {
        super(imeIPrezime, jmbg, godRodjenja);
        this.brojIgraca = brojIgraca;
        this.pozicija = pozicija;
        this.kapiten = kapiten;
    }

    public String getBrojIgraca() {
        return brojIgraca;
    }

    public void setBrojIgraca(String brojIgraca) {
        this.brojIgraca = brojIgraca;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isKapiten() {
        return kapiten;
    }

    public void setKapiten(boolean kapiten) {
        this.kapiten = kapiten;
    }

    @Override
    public void stampaj(){
        System.out.println("IGRAC:");
        System.out.println(this.imeIPrezime + ", " + this.jmbg + ", " + this.godRodjenja);
        System.out.println("broj igraca " + this.brojIgraca);
        System.out.println("pozicija: " + this.pozicija);
        System.out.println("kapiten: " + this.kapiten);
        System.out.println();

    }
}

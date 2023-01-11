package p10_01_2023;

public class FacebookPost {
    private String opis;
    private String korisnik;
    private Korisnik jeKorisnik;

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(String korisnik) {
        this.korisnik = korisnik;
    }

    public Korisnik getJeKorisnik() {
        return jeKorisnik;
    }

    public void setJeKorisnik(Korisnik jeKorisnik) {
        this.jeKorisnik = jeKorisnik;
    }

    public void print(){
        System.out.println("Ime i prezime " + this.jeKorisnik.getIme() + " " + this.jeKorisnik.getPrezime());
        System.out.println(opis);
    }
}

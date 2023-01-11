package d10_01_2023;

public class Proizvod {

    private String naziv;
    private Kupac kupac;
    private double cenaIzrade;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Kupac getKupac() {
        return kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }

    public double getCenaIzrade() {
        return cenaIzrade;
    }

    public void setCenaIzrade(double cenaIzrade) {
        this.cenaIzrade = cenaIzrade;
    }

    public Proizvod(String naziv, double cenaIzrade) {
        this.naziv = naziv;
        this.cenaIzrade = cenaIzrade;
    }

    public double cenaProizvoda(){
        double x = this.cenaIzrade * 1.9 * (100 - this.kupac.getKartica().getPopust()) / 100;
        return x;
    }
    public void stampa (){
        System.out.println(this.naziv + " " + this.cenaProizvoda());
        System.out.println(this.kupac.getImeIPrezime() + " - " + this.kupac.getKartica().getBrojKartice());
    }
}

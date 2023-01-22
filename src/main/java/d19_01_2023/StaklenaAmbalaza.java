package d19_01_2023;

public class StaklenaAmbalaza extends Ambalaza{
    private int kaucija;
    private boolean mogucaKaucija;
    private int osnovnaCena;

    public StaklenaAmbalaza(String barkod, String nazivArtikla, int netoTezina, int brutoTezina, int kaucija, boolean mogucaKaucija, int osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.kaucija = kaucija;
        this.mogucaKaucija = mogucaKaucija;
        this.osnovnaCena = osnovnaCena;
    }

    public int getKaucija() {
        return kaucija;
    }

    public void setKaucija(int kaucija) {
        this.kaucija = kaucija;
    }

    public boolean isMogucaKaucija() {
        return mogucaKaucija;
    }

    public void setMogucaKaucija(boolean mogucaKaucija) {
        this.mogucaKaucija = mogucaKaucija;
    }

    public int getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(int osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    public double cenaArtikla() {
        if (this.mogucaKaucija == true) {
            return this.osnovnaCena * 1.2 + this.kaucija;
        } else return this.osnovnaCena * 1.2;
    }
    public void stampaj(){
        System.out.println(this.getNazivArtikla() + ", Cena: " + this.cenaArtikla());
        System.out.println("Bruto tezina " + this.getBrutoTezina() + ", Neto tezina: " + this.getNetoTezina());
        System.out.println("Barkod: " + getBarkod());
    }

}

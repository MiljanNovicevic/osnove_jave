package d19_01_2023;

public abstract class Ambalaza {

    private String barkod;
    private String nazivArtikla;
    private int netoTezina;
    private int brutoTezina;

    public Ambalaza(String barkod, String nazivArtikla, int netoTezina, int brutoTezina) {
        this.barkod = barkod;
        this.nazivArtikla = nazivArtikla;
        this.netoTezina = netoTezina;
        this.brutoTezina = brutoTezina;
    }

    public String getBarkod() {
        return barkod;
    }

    public void setBarkod(String barkod) {
        this.barkod = barkod;
    }

    public String getNazivArtikla() {
        return nazivArtikla;
    }

    public void setNazivArtikla(String nazivArtikla) {
        this.nazivArtikla = nazivArtikla;
    }

    public int getNetoTezina() {
        return netoTezina;
    }

    public void setNetoTezina(int netoTezina) {
        this.netoTezina = netoTezina;
    }

    public int getBrutoTezina() {
        return brutoTezina;
    }

    public void setBrutoTezina(int brutoTezina) {
        this.brutoTezina = brutoTezina;
    }

    public double tezinaPakovanja() {
        int tezinaPakovanja = 0;
        return tezinaPakovanja = this.brutoTezina - this.netoTezina;
    }

    public abstract double cenaArtikla();
    public abstract void stampaj();

}

package p17_01_2023;

public abstract class PlatnaKartica {
    protected double suma;
    protected String brojKartice;
    protected String godVazenja;
    protected String mesecVazenja;

    public PlatnaKartica(int suma, String brojKartice, String godVazenja, String mesecVazenja) {
        this.suma = suma;
        this.brojKartice = brojKartice;
        this.godVazenja = godVazenja;
        this.mesecVazenja = mesecVazenja;
    }

    public double getSuma() {
        return suma;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public String getGodVazenja() {
        return godVazenja;
    }

    public String getMesecVazenja() {
        return mesecVazenja;
    }
    public void dodajSredstva (double uplata){
        this.suma = this.suma + uplata;
    }


    public abstract void izvrsiTransakciju();

    public abstract void stampaj();



}

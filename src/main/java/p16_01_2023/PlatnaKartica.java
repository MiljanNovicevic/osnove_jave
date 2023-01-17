package p16_01_2023;

public class PlatnaKartica {
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


    public double izvrsiTransakciju (double trosak){
        this.suma = this.suma - trosak;
        return this.suma;
    }
    public void stampaj(){
        System.out.println(this.brojKartice + ", " + this.mesecVazenja + "/" + this.godVazenja + ", " + this.suma);
    }


}

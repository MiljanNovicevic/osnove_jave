package p17_01_2023;

public class VisaKartica extends PlatnaKartica {

    private String ovlascenoLice;

        public VisaKartica(int suma, String brojKartice, String godVazenja, String mesecVazenja) {
        super(suma, brojKartice, godVazenja, mesecVazenja);
    }
    @Override
    public void izvrsiTransakciju() {
        double suma = this.suma - (this.suma / 0.018);
    }
    public String getOvlascenoLice() {
        return ovlascenoLice;
    }

    public void setOvlascenoLice(String ovlascenoLice) {
        this.ovlascenoLice = ovlascenoLice;
    }


    @Override
    public void stampaj(){
        System.out.println(this.ovlascenoLice + " " + this.brojKartice + ", " + this.mesecVazenja + "/" + this.godVazenja +"  "+ this.suma);
    }

}

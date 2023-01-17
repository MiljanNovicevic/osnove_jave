package p16_01_2023;

public class VisaKartica extends PlatnaKartica{

    private String ovlascenoLice;

        public VisaKartica(int suma, String brojKartice, String godVazenja, String mesecVazenja) {
        super(suma, brojKartice, godVazenja, mesecVazenja);
    }

    public String getOvlascenoLice() {
        return ovlascenoLice;
    }

    public void setOvlascenoLice(String ovlascenoLice) {
        this.ovlascenoLice = ovlascenoLice;
    }
    @Override
    public double izvrsiTransakciju (double suma){
          return  suma=this.suma-(this.suma/0.018);
    }

    @Override
    public void stampaj(){
        System.out.println(this.ovlascenoLice + " " + this.brojKartice + ", " + this.mesecVazenja + "/" + this.godVazenja +"  "+ this.suma);
    }

}

package p12_01_2023;

public class Korisnik {

    private String imeIPrezime;
    private String tipLicence;

    public Korisnik(){
        this.tipLicence="basic";
        }

    public Korisnik (String imeIPrezime){
        this.imeIPrezime=imeIPrezime;
        this.tipLicence = "basic";
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getTipLicence() {
        return tipLicence;
    }



    public int pretplatiSe (int uplacenaSuma) {
        if (uplacenaSuma > 100){
            this.tipLicence.equals("pro");
        } else if (uplacenaSuma > 150) {
            this.tipLicence.equals("premium");
                    }

        return uplacenaSuma;
    }

    public void ponistiPretplatu (String ponistiPretplatu){
        if (ponistiPretplatu.equals("ponisti pretplatu")){
            this.tipLicence.equals("Basic");

        }
    }
    public int maksDuzina (){
        if (this.tipLicence.equals("basic")){
            return 40;}
        else if (this.tipLicence.equals("pro")) {
            return 240;
        } else if (this.tipLicence.equals("premium")) {
            return 1440;

        }
        return 0;
    }

    public void stampa(){
        System.out.println(this.imeIPrezime);
    }
}

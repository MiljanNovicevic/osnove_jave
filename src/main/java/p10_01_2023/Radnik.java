package p10_01_2023;

public class Radnik {

    private String jmbg;
    private String imeIPrezime;
    private int brojDece;
    private int sss;
    private int godineStaza;




    public Radnik (String jmbg){
        this.jmbg=jmbg;
       }

    public Radnik(String jmbg, String imeIPrezime, int brojDece, int sss, int godineStaza) {
        this.jmbg = jmbg;
        this.imeIPrezime = imeIPrezime;
        this.brojDece = brojDece;
        this.sss = sss;
        this.godineStaza = godineStaza;
    }

    public String getJmbg() {
        return jmbg;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public int getBrojDece() {
        return brojDece;
    }

    public int getSss() {
        return sss;
    }

    public int getGodineStaza() {
        return godineStaza;
    }


    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public void setBrojDece(int brojDece) {
        this.brojDece = brojDece;
    }

    public void setSss(int sss) {
        this.sss = sss;
    }

    public void setGodineStaza(int godineStaza) {
        this.godineStaza = godineStaza;
    }

public int koeficijentSlozenosti (){
        return this.sss *this.brojDece;
    }

    public void stampaj(){
        System.out.println("Ime i prezime " + this.imeIPrezime);
        System.out.println("");
    }

}

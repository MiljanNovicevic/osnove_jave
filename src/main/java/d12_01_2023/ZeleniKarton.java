package d12_01_2023;

public class ZeleniKarton {
    private String imeIPrezime;
    private String brIndeksa;
    private String predmet;
    private String imeProfesora;
    private int ocena;

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getBrIndeksa() {
        return brIndeksa;
    }

    public void setBrIndeksa(String brIndeksa) {
        this.brIndeksa = brIndeksa;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public String getImeProfesora() {
        return imeProfesora;
    }

    public void setImeProfesora(String imeProfesora) {
        this.imeProfesora = imeProfesora;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public ZeleniKarton(String imeIPrezime, String brIndeksa, String predmet, String imeProfesora, int ocena) {
        this.imeIPrezime = imeIPrezime;
        this.brIndeksa = brIndeksa;
        this.predmet = predmet;
        this.imeProfesora = imeProfesora;
        this.ocena = ocena;
    }

    public boolean polozioIspit(){
        if (ocena > 5 && ocena <= 10){
            return true;
        } else {
            return false;
        }
    }

    public void print(){
        System.out.println("(" + this.predmet + ")" + " - " + this.ocena + '\n' +
                "Student: " + this.imeIPrezime + ", " + this.brIndeksa + '\n'+
                "Profesor: " +  this.imeProfesora);

    }
}

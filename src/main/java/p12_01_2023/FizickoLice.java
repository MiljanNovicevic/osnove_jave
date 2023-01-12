package p12_01_2023;

public class FizickoLice {

    private String imeIPrezime;
    private String brojLicne;
    private String jmbg;
    private boolean vecKupovao;

    public FizickoLice(String imeIPrezime, String brojLicne, String jmbg, boolean vecKupovao) {
        this.imeIPrezime = imeIPrezime;
        this.brojLicne = brojLicne;
        this.jmbg = jmbg;
        this.vecKupovao = vecKupovao;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getBrojLicne() {
        return brojLicne;
    }

    public void setBrojLicne(String brojLicne) {
        this.brojLicne = brojLicne;
    }

    public String getJmbg() {
        return jmbg;
    }

    public boolean isVecKupovao() {
        return vecKupovao;
    }

    public void setVecKupovao(boolean vecKupovao) {
        this.vecKupovao = vecKupovao;
    }

    public void stampaj(){
        System.out.println(this.imeIPrezime + " broj licne karte: " + this.brojLicne);
    }
}

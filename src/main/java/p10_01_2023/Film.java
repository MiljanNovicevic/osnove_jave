package p10_01_2023;

public class Film {

    private String nazivFilma;
    public int godFilma;

    public Film(String nazivFilma, int godFilma) {
        this.nazivFilma = nazivFilma;
        this.godFilma = godFilma;
    }

    public String getNazivFilma() {
        return nazivFilma;
    }

    public void setNazivFilma(String nazivFilma) {
        this.nazivFilma = nazivFilma;
    }

    public int getGodFilma() {
        return godFilma;
    }

    public void setGodFilma(int godFilma) {
        this.godFilma = godFilma;
    }

    public void stampaj(){
        System.out.println("Naziv filma '" + this.nazivFilma + "' " + this.godFilma);

    }
}

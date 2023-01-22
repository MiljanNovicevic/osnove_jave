package p19_01_2023;

public class Zgrada extends Objekat{

    private int brojStanova;

    public Zgrada(String adersa, int povrsina, int zona, int brojStanova) {
        super(adersa, povrsina, zona);
        this.brojStanova = brojStanova;
    }

    public int getBrojStanova() {
        return brojStanova;
    }

    public void setBrojStanova(int brojStanova) {
        this.brojStanova = brojStanova;
    }
    @Override
    public double porezObjekta(){
        double porez = this.povrsina * this.koeficijent() * this.brojStanova;
        return porez;
    }

    @Override
    public void stampaj(){
        System.out.println("Adresa: " + this.adersa + ", " + "Povrsina: " + this.povrsina + ", Zona: "  + this.zona);
        System.out.println("Broj stanova " + this.brojStanova);
    }
}

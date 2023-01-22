package p19_01_2023;

public class Kuca extends Objekat{

    private int brojClanova;

    public Kuca(String adersa, int povrsina, int zona, int brojClanova) {
        super(adersa, povrsina, zona);
        this.brojClanova = brojClanova;
    }

    public int getBrojClanova() {
        return brojClanova;
    }

    public void setBrojClanova(int brojClanova) {
        this.brojClanova = brojClanova;
    }

    @Override
    public double porezObjekta(){
        double porez = this.povrsina * this.koeficijent();
        return porez;
    }

    @Override
    public void stampaj(){
        System.out.println("Adresa: " + this.adersa + ", " + "Povrsina: " + this.povrsina + ", Zona: "  + this.zona);
        System.out.println("Broj clanova " + this.brojClanova);
    }

}

package p19_01_2023;

public class Lokal extends Objekat {

    public Lokal(String adersa, int povrsina, int zona) {
        super(adersa, povrsina, zona);
    }

    @Override
    public double porezObjekta() {
        double porez = this.povrsina * this.koeficijent() * 1.3;
        return porez;
    }

    @Override
    public void stampaj() {
        System.out.println("Adresa: " + this.adersa + ", " + "Povrsina: " + this.povrsina + ", Zona: " + this.zona);
    }
}
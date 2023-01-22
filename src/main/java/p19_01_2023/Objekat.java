package p19_01_2023;

public abstract class Objekat {

    protected String adersa;
    protected int povrsina;
    protected int zona;

    public Objekat(String adersa, int povrsina, int zona) {
        this.adersa = adersa;
        this.povrsina = povrsina;
        this.zona = zona;
    }

    public String getAdersa() {
        return adersa;
    }

    public void setAdersa(String adersa) {
        this.adersa = adersa;
    }

    public int getPovrsina() {
        return povrsina;
    }

    public void setPovrsina(int povrsina) {
        this.povrsina = povrsina;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public double koeficijent(){
        if (zona == 1){
            return 1.4;
        } else if (zona == 2) {
            return 1.1;
        }else return 1.05;
    }

    public abstract double porezObjekta();
    public abstract void stampaj();
}

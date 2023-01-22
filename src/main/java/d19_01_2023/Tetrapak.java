package d19_01_2023;

public class Tetrapak extends Ambalaza {

    private boolean recyclable;
    private int osnovnaCena;

    public Tetrapak(String barkod, String nazivArtikla, int netoTezina, int brutoTezina, boolean recyclable, int osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.recyclable = recyclable;
        this.osnovnaCena = osnovnaCena;
    }

    public boolean isRecyclable() {
        return recyclable;
    }

    public void setRecyclable(boolean recyclable) {
        this.recyclable = recyclable;
    }

    public int getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(int osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    public double cenaArtikla(){
        if (this.recyclable==true){
            return this.tezinaPakovanja()* 1.5 + this.osnovnaCena;
        } else return this.osnovnaCena;

    }

    public void stampaj(){
        System.out.println(this.getNazivArtikla() + ", Cena: " + this.cenaArtikla());
        System.out.println("Bruto tezina " + this.getBrutoTezina() + ", Neto tezina: " + this.getNetoTezina());
        System.out.println("Barkod: " + getBarkod());
    }

}

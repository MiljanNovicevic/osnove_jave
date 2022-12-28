package d27_12_2022;

public class Proizvod {

    public String naziv;
    public double cena;
    public double tezina;

    public void stampaj(){
        System.out.println(this.naziv + ", " + this.cena + ", " + this.tezina + "g");
    }
    public double konvertuj(String jedinica){
        if (jedinica.contains("kg")){
            return this.tezina / 1000;
        }else if (jedinica.contains("t")){
            return this.tezina / 10000;
        }



    return 0;
    }

}

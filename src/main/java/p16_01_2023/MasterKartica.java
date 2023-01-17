package p16_01_2023;

public class MasterKartica extends PlatnaKartica{

    public MasterKartica(int suma, String brojKartice, String godVazenja, String mesecVazenja) {
        super(suma, brojKartice, godVazenja, mesecVazenja);
    }
    @Override
    public double izvrsiTransakciju (double suma){
        return  suma=this.suma-(this.suma/0.018);
    }

    public double naplatiTransakciju (double suma){
        return  suma=this.suma-2;
    }

    @Override
    public void stampaj(){
        System.out.println(this.brojKartice + ", " + this.mesecVazenja + "/" + this.godVazenja + "  "+ this.suma);
    }
}

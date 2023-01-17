package p16_01_2023;

public class Profesor extends Osoba {
    private String nazivPredmeta;
    private double iznosPlate;

    public Profesor(String imeIPrezime, String jmbg, String nazivPredmeta, int iznosPlate) {
        super(imeIPrezime, jmbg);
        this.nazivPredmeta = nazivPredmeta;
        this.iznosPlate = iznosPlate;
    }

    public double povecajPlatu(double procenatPOvecanja){
       return iznosPlate=this.iznosPlate*(1+procenatPOvecanja);
    }

    @Override
    public void stampaj(){
        System.out.println(this.imeIPrezime + " " + jmbg);
        System.out.println("iznos plate: " + this.iznosPlate);
        System.out.println("Naziv predmeta: " + this.nazivPredmeta);

    }


}

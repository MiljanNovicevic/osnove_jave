package p16_01_2023;

public class Student extends Osoba{

    private String brojIndeksa;
    private double dug;

    public Student(String imeIPrezime, String jmbg, String brojIndeksa, int dug) {
        super(imeIPrezime, jmbg);
        this.brojIndeksa = brojIndeksa;
        this.dug = dug;
    }

    public void uplatiSkolarinu(double uplata){
        this.dug = this.dug - uplata;
    }
    @Override
    public void stampaj(){
        System.out.println(this.imeIPrezime);
        System.out.println("Broj indeksa: " + this.brojIndeksa);
        System.out.println(this.dug);
    }
}

package p16_01_2023;

public class Osoba {
    protected String imeIPrezime;
    protected String jmbg;


    public Osoba(String imeIPrezime, String jmbg) {
        this.imeIPrezime = imeIPrezime;
        this.jmbg = jmbg;
    }

    public Osoba(String milanMilanovic, String jmbg, String s, int i) {
    }


    public void stampaj(){
        System.out.println(this.imeIPrezime + " jmbg " + this.jmbg);
    }
}

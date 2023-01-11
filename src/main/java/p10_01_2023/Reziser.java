package p10_01_2023;

public class Reziser {

    private String imeIPrezime;
    private int Starost;

    public Reziser(String imeIPrezime, int starost) {
        this.imeIPrezime = imeIPrezime;
        Starost = starost;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getStarost() {
        return Starost;
    }

    public void setStarost(int starost) {
        Starost = starost;
    }
    public void print (){
        System.out.println("Ime rezisera: " + this.imeIPrezime + "; Godine: " + this.Starost);
    }
}

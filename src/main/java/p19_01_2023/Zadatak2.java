package p19_01_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        PoreskaUprava p1 = new PoreskaUprava("Nis");

        Kuca k1 = new Kuca("Nis",100,1,4);
        p1.dodajObjekat(k1);
        p1.stampaj();

        Zgrada z1 = new Zgrada("Blagoja Parkovica 17",2500,1,120);
        p1.dodajObjekat(z1);
        p1.stampaj();







    }
}

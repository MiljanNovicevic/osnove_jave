package d16_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        Igrac i1 = new Igrac("Aleksandar Mitrovic", "13155616512356", 1989, "25","napadac",true);
        Igrac i2 = new Igrac("Nemanja Matic", "41651968165198", 1986, "12","vezni",false);

        Trener t1 = new Trener("Dragan Stojkovic", "13216819815619", 1960, 25, "Menadzer");
        Trener t2 = new Trener("Arsen Wenger", "16519123198198", 1954, 30, "Menadzer");

        i1.stampaj();
        t1.stampaj();
        i2.stampaj();
        t2.stampaj();


    }
}

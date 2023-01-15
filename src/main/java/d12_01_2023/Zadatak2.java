package d12_01_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        Racun racun1 = new Racun("123546-789843241", "Miljan Novicevic", 20500);
        Racun racun2 = new Racun("549813549-5498465198", "Marko Markovic", 56400);
        Transakcija transakcija1 = new Transakcija(74856, racun2,racun1);

        transakcija1.izvrsiTransakciju(5200);

        racun1.print();
        racun2.print();
        transakcija1.print();


    }
}

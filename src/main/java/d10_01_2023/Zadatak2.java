package d10_01_2023;

public class Zadatak2 {
    public static void main(String[] args) {

    ClanskaKartica x = new ClanskaKartica(10, "1459-8897-9452-5858");
    Kupac y = new Kupac("Miljan Novicevic");


    y.setKartica(x);
    y.stampa();


    Proizvod c = new Proizvod("Televizor", 60000);


    c.setKupac(y);
    c.stampa();

            }

    }


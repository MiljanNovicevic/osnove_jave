package d27_12_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//Kreirati klasu SmartAirConditioning koja ima:
//atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//atribut za izabranu temperaturu
//atribut za mod (hladi/greje) - string
//metodu za stampu (proizvoljno)
//metodu koja vraca informaciju da li je napolju veca temperatura od one na koju je klima postavljena. Metoda kao parametar prima temperaturu koja je napolju.
//
//
//U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i za svaki od njih pozvati metode

        SmartAirConditioning klima1 = new SmartAirConditioning();
        klima1.brand = "Samsung";
        klima1.temp = 24.5;
        klima1.mode = "Hladi";
        klima1.stampaj();

        System.out.println("Unesite spoljnu temperaturu");
        int x = s.nextInt();
        System.out.println(klima1.spoljnjaTemp(x));

        SmartAirConditioning klima2 = new SmartAirConditioning();
        klima2.brand = "Gree";
        klima2.temp = 15;
        klima2.mode = "Greje";
        klima2.stampaj();

        System.out.println("Unesite spoljnu temperaturu");
        int y = s.nextInt();
        System.out.println(klima1.spoljnjaTemp(y));



    }
}

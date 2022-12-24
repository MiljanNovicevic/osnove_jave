package d21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;
//Napisati program koji u sebi ima definisan niz od 10 broja (brojevi su proizvoljni) i koji menja vrednost elementa na pozciji K. K i novu vrednost unosi korisnik.
public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> brojevi = new ArrayList<>();

        brojevi.add(10);
        brojevi.add(20);
        brojevi.add(30);
        brojevi.add(40);
        brojevi.add(50);
        brojevi.add(60);
        brojevi.add(70);
        brojevi.add(80);
        brojevi.add(90);
        brojevi.add(100);

        System.out.println("Unesite poziciju: ");
        int k = s.nextInt();
        System.out.println("Unesite novu vrednost");
        int n = s.nextInt();

        brojevi.set(k, n);

        System.out.println("Vrednost elementa na poziciji " + k + " je " + brojevi.get(k));

    }
}

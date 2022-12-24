package p21_12_2022;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {
        //Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i menja vrednost elementa na poziciji 3 tako sto je povecava 10 puta.

        ArrayList<Integer> brojevi = new ArrayList<Integer>();

        brojevi.add(40);
        brojevi.add(22);
        brojevi.add(15);
        brojevi.add(10);
        brojevi.add(85);

        int a = brojevi.get(3) *10;
        brojevi.set(3, a);



        System.out.println(brojevi.get(3));


    }
}

package p21_12_2022;

import java.util.ArrayList;

public class Zadatak3 {
    public static void main(String[] args) {
        //Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i koji zamenjuje vrednosti prvog (na poziciji nula) i zadnjeg elemnta niza.

        ArrayList<Integer> brojevi = new ArrayList<Integer>();

        brojevi.add(40);
        brojevi.add(22);
        brojevi.add(15);
        brojevi.add(10);
        brojevi.add(85);


        int x = brojevi.get(0);
        brojevi.set(0, brojevi.get(4));//na nultoj poslednji
        brojevi.set(4, x); //na poslednjem vrednost iz nultog

        System.out.println(brojevi.get(0) + ", " + brojevi.get(4));








    }
}

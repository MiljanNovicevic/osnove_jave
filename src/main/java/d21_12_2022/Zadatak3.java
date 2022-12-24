package d21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

//Napisati program koji ucitava niz A duzine N, i koji nakon unosa niz A stampa sve elemente niza koji su veci od nule.
public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> nizBrojeva = new ArrayList<>();

        System.out.println("Unesite N: ");
        int n = s.nextInt();
        int broj = 0;



        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj");
            broj = s.nextInt();
            nizBrojeva.add(broj);

                            }

        for (int i = 0; i < nizBrojeva.size(); i++) {
            if (nizBrojeva.get(i) > 0){
                System.out.println(nizBrojeva.get(i) + ", ");
        }

        }


    }
}

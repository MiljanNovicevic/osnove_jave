package d21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;
//Napisati program koji ucitava N brojeva i smesta ih u niz. Zatim, iz niza, broji koliko je parnih brojeva uneto. brojeve unosi korisnik.
public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> nizBrojeva = new ArrayList<>();



        System.out.println("Unesite vrednost n: ");
        int n = s.nextInt();
        int broj = 0;
        int brojac = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite brojeve");
            broj = s.nextInt();
            nizBrojeva.add(broj);
            if (broj % 2 == 0){
                brojac++;
            }


        }
        System.out.println("U nizu ima " + brojac + " parna broja");
    }
}

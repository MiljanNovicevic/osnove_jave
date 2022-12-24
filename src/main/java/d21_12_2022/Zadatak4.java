package d21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

//. Napisati program koji ucitava niz A duzine N i broj X. Nakon unosa treba ispisati indekse onih clanova niza koji su jednaki broju X.
public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> nizBrojeva = new ArrayList<>();

        System.out.println("Unesite N: ");
        int n = s.nextInt();
        int broj = 0;
        int veciOdNule=0;



        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj");
            broj = s.nextInt();
            nizBrojeva.add(broj);

        }

        System.out.println("Unesite x ");
        int x = s.nextInt();


        for (int i = 0; i < nizBrojeva.size(); i++) {
            if (nizBrojeva.get(i) == x){
                System.out.println("Elementi niza A koji su jednaki broju X imaju indekse: ");
                System.out.print(i + ", ");
        }

        }


    }
}

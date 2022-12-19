package p19_12_2022;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("unesite vrednost n: ");
        int n = s.nextInt();
        int parniBrojevi = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("unesite broj: ");
            int unetiBroj = s.nextInt();
            if (unetiBroj % 2 == 0) {
                parniBrojevi++;
            }


        }
        System.out.println("Broj parnih brojeva je: "+ parniBrojevi);


    }
}

package p19_12_2022;

import java.util.Scanner;

public class Zadatak6vezbanje {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("unesite vrednost n: ");
        int n = s.nextInt();
        int unetiBroj = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("unesite broj: ");
            unetiBroj = s.nextInt();
            unetiBroj = unetiBroj+unetiBroj;


        }
        System.out.println("Broj parnih brojeva je: "+ unetiBroj+unetiBroj);


    }
}

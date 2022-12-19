package p19_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite vrednost N: ");
        int N = s.nextInt();

        System.out.println("Unesite vrednost K: ");
        int K = s.nextInt();

        int rezultat = 1;

        for (int i = 1; i <=K; i++) {
            rezultat=rezultat * N;


        }
        System.out.println("Rezultat je " + rezultat);

    }
}

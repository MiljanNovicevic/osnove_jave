package d19_12_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//Napisati program koji ucitava N brojeva od korisnika i sabira samo trocifrene brojeve.
        System.out.println("Unesite n: ");
        int n = s.nextInt();
        int broj = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj: ");
            int a = s.nextInt();
            if (a > 99 && a < 1000){
                broj = broj + a;
            }

        }
        System.out.println("suma trocifrenih brojeva je: " + broj);
    }
}

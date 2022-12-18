package d16_12_2022;

import java.util.Scanner;

public class Zadatak4Vezbanje {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite dimenziju tabele: ");
        int x = s.nextInt();

        for (int i = 0; i < (x*x); i++) {
            if (i % x == 0){
                System.out.println();
            }
            System.out.print("_|");

        }
    }
}

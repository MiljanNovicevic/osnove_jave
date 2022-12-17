package d13_12_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite vrednost x: ");
        int x = s.nextInt();
        System.out.println("Unesite vrednost y: ");
        int y = s.nextInt();

        int z = (x-y) * (x-y);

        System.out.println("Vrednost Z je: " + z);

    }
}

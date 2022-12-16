package p16_12_2022;

import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("unesite a: ");
        int a = s.nextInt();
        System.out.println("unesite b: ");
        int b = s.nextInt();

        for (int i = 0; i <= 20; i++) {
            if (i >= a && i <= b)
                System.out.print("_");
            else System.out.print("*");

        }
    }
}

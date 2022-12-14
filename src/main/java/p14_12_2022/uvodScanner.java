package p14_12_2022;

import java.util.Scanner;

public class uvodScanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("unesite a:");
        int a = s.nextInt();
        System.out.println("unesite b:");
        int b = s.nextInt();
        int sum = a + b;

        System.out.println("unesite double:");
        double x = s.nextDouble();

        System.out.println("Suma " + a + "+" + b + "=" + sum);
        System.out.println("Double vrednost je: " + x);
    }
}

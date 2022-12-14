package p14_12_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("unesite prvi broj: ");
        double a = s.nextDouble();
        System.out.println("unesite drugi broj: ");
        double b = s.nextDouble();
        System.out.println("unesite treci broj: ");
        double c = s.nextDouble();

        System.out.println("Srednja vrednost je " + (a+b+c)/3);

    }
}

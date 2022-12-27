package d26_12_2022;

import java.util.Scanner;

public class Zadatak7Vezbanje {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//Napisati funkciju koja pronalazi koliko ima celih brojeve izmedju brojeva M i N.

        System.out.println("Unesite vrednost n: ");
        int n = s.nextInt();
        System.out.println("Unesite vrednost m: ");
        int m = s.nextInt();

        int x = izbroji(n,m);
        System.out.println("postoji "+ x + " celih brojeva izmedju " + n + " i " + m);


    }

    public static int izbroji (int n, int m){
        int x = m - n - 1;
        return x;


    }

}

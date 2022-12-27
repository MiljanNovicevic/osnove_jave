package d26_12_2022;

import java.util.Scanner;

public class Zadatak8Vezbanje {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite prvi broj ");
        int a =s.nextInt();
        System.out.println("Unesite drugi broj ");
        int b = s.nextInt();
        System.out.println("Unesite treci broj ");
        int c = s.nextInt();

        int z = najmanjiBroj(a, b, c);
        System.out.println("Najmanji broj je: "+ z);


    }

    public static int najmanjiBroj(int a, int b, int c) {
        if (a<b && a<c){
            return a;
        }
        if (b<a && b<c){
            return b;
        }
        else return c;

    }
}

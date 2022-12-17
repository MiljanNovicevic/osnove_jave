package d13_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite vrednost za stranicu trougla: ");
        int a = s.nextInt();
        double koren = 1.73;

        double obim = a * 3;
        double povrsina = koren * ((a*a)/4);


        System.out.println(obim);
        System.out.println(povrsina);
    }
}

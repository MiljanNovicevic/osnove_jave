package d13_12_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite ime: ");
        String ime = s.next();
        System.out.println("Unesite prezime: ");
        String prezime = s.next();

        System.out.println("****************************************");
        System.out.println("*   Credit Card                        *");
        System.out.println("*      ****                            *");
        System.out.println("*      ****                            *");
        System.out.println("*          1234 1232 4321 1212         *");
        System.out.println("*                     valid > 10/25    *");
        System.out.println("*                                      *");
        System.out.println("*   " +  ime + " " + prezime  +"       *");
        System.out.println("****************************************");
    }
}

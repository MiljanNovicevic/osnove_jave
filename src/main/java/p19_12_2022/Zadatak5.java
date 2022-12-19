package p19_12_2022;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("unesite vrednost n: ");
        int n = s.nextInt();
        int suma = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("unesite broj: ");
            int unetiBroj = s.nextInt();
            suma = suma + unetiBroj;


        }
        System.out.println("Zbir unetih brojeva je: "+ suma);


    }
}

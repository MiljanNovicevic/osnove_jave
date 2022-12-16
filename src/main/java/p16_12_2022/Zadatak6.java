package p16_12_2022;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int v = 1;

        System.out.println("unesite ime: ");
        String ime = s.next();
        System.out.println("unesite prezime: ");
        String prezime = s.next();
        System.out.println("unesite JMBG ");
        String jmbg = s.next();
        System.out.println("Unesite broj primeraka za stampu ");
        int brStampa = s.nextInt();

        for (int i = 1; i <= brStampa; i++) {
            System.out.println("Primerak "+ i);
            System.out.println("*******************");
            System.out.println(ime + " " + prezime );
            System.out.println("JMBG: " + jmbg);
            System.out.println();
            System.out.println("********************");

        }



    }
}

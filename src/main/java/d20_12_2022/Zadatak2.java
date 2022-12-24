package d20_12_2022;

import java.util.Scanner;
//Napisati program koji ucitava RIMSKE brojeva od korisnika i na ekranu ispisuje arapsku vrednost sve dok korisnik ne unese KRAJ..
public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite rimski broj: ");
        String rimski = "";
        int arapski = 0;


        while (!rimski.equals("KRAJ")){
            rimski = s.next();
            if (rimski.equals("I")){
                System.out.println("Arapski 1");
            } else if (rimski.equals("V")) {
                System.out.println("Arapski 5");
            } else if (rimski.equals("X")) {
                System.out.println("Arapski 10");
            } else if (rimski.equals("L")) {
                System.out.println("Arapski 50");
            } else if (rimski.equals("C")) {
                System.out.println("Arapski 100");
            } else if (rimski.equals("D")) {
                System.out.println("Arapski 500");
            }else if (rimski.equals("M")){
                System.out.println("Arapski 1000");
            }

        }
        System.out.println("Kraj programa");

    }
}

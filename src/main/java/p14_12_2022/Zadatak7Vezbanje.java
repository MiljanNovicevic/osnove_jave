package p14_12_2022;

import java.util.Scanner;

public class Zadatak7Vezbanje {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("unesite znak karte na stolu: ");
        String znakSto = s.next();
        System.out.println("unesite broj karte na stolu: ");
        String brojSto = s.next();
        System.out.println("unesite znak karte koju zelite da odigrate: ");
        String mojZnak = s.next();
        System.out.println("Unesite broj karte koju zelite da odigrate: ");
        String mojBroj = s.next();

        if (znakSto.equals(mojZnak) || brojSto.equals(mojBroj)) {
            System.out.println("potez je validan");
        } else {
            System.out.println("potez nije validan");}
        }



    }


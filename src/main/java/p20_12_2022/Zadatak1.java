package p20_12_2022;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("unestite broj: ");
        int broj = s.nextInt();

        while (broj < 10 || broj > 50){
            System.out.println("Greska. Broj nije u opsegu od 10 do 50");
            System.out.println("unesite broj");
            broj = s.nextInt();
            if (broj < 10 || broj > 50){
                System.out.println("Greska. Broj nije u opsegu od 10 do 50");

        }

            System.out.println("Broj je validan, kraj programa");


    }
}}

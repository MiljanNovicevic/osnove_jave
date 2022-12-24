package d20_12_2022;

import java.sql.SQLOutput;
import java.util.Scanner;

//Napisati program koji od korisnika ucitava brojeve sve dok ne unesu bar dve dvojke ili tri jedinice.
public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int broj = 0;
        int brojacDvojki = 0;
        int brojacJedinica = 0;

        while (brojacDvojki < 2 && brojacJedinica < 3){
            System.out.println("Unesite broj: ");
            broj = s.nextInt();
            if (broj == 2){
                brojacDvojki++;}
               else if (broj == 1){
                    brojacJedinica++;
                }
            }
        System.out.println("Kraj programa");
        }

    }


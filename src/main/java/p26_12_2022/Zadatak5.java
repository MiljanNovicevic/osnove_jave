package p26_12_2022;

import javax.sound.midi.MidiFileFormat;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//Napisati metodu koja stampa N zvezdica u istom redu. Broj zvezdica je odredjen parametrom N.
//Ako se metoda pozove za N=5, metoda stampa 5 zvezdica i enter
//N=5, print je=> * * * * *
//
//Ako se metoda pozove za N = 9, metoda stampa 9 zvezdica i enter
//N=9, print je=> * * * * * * * * *
        System.out.println("Unesite broj n: ");
        int n = s.nextInt();
        zvezdice(n);

        }


    public static void zvezdice(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
            System.out.println();


        }




    }

}
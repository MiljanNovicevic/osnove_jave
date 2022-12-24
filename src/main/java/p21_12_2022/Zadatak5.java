package p21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList<Integer> brojevi = new ArrayList<Integer>();

        brojevi.add(10);
        brojevi.add(20);
        brojevi.add(30);
        brojevi.add(40);
        brojevi.add(50);

        int suma = 0;

        for (int i = 0; i < brojevi.size(); i++) {
            suma = suma + brojevi.get(i);



        }
        System.out.println("Suma je " + suma);
        }



    }


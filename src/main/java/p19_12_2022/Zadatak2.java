package p19_12_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //int x = s.nextInt();
        int suma = 0;
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0){
            suma = suma + i;
        }}

        System.out.println("Suma parnih brojeva od 1 do 50 je: " + suma);
    }
}
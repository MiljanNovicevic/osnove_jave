package p19_12_2022;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //int x = s.nextInt();
        int suma = 0;
        for (int i = 0; i <= 10; i++) {
            suma = suma + i;
        }

        System.out.println("Suma brojeva od 1 do 10 je: " + suma);
    }
}

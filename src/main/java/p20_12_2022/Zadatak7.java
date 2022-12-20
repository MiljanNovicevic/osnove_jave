package p20_12_2022;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 0;
        int suma = 0;
        int konacnaSuma = 0;

        while (suma < 100){
            System.out.println("unesite vrednost ");
            a = s.nextInt();
            suma = suma + a;}
            if (suma > 100){
            konacnaSuma=suma-a;


        }
        System.out.println("Prekoracenje ! Kraj programa. sracunata suma je " + konacnaSuma);


    }
}

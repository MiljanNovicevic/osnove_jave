package p16_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite vrednost M ");
        int M = s.nextInt();
        System.out.println("Unesite vrednost N ");
        int N = s.nextInt();

        for (int i = M; i <= N; i++){
            System.out.print(i + ",");
        }
    }
}

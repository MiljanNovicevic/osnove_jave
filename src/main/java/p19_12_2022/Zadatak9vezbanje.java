package p19_12_2022;

import java.util.Scanner;

public class Zadatak9vezbanje {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("unesite petocifreni broj: ");
        int n = s.nextInt();
        int x=5;
        int jednocifren = 0;

        for (int i = 0; i <=x; i++) {
            jednocifren=(n%10000);
            jednocifren=(n%1000);
            jednocifren=(n%100);



            System.out.println(jednocifren);

        }











    }
}

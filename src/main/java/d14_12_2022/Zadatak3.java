package d14_12_2022;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite x za T1: ");
        int t1X = s.nextInt();
        System.out.println("Unesite y za T1: ");
        int t1Y = s.nextInt();
        System.out.println("Unesite x za T2: ");
        int t2X = s.nextInt();
        System.out.println("Unesite y za T2: ");
        int t2Y = s.nextInt();
        System.out.println("Unesite x za M: ");
        int mX = s.nextInt();
        System.out.println("Unesite y za M: ");
        int yX = s.nextInt();

        if (mX <= t1X || mX <= t1Y) {
            System.out.println("Kliknuto je unutar forme ");}

        else System.out.println("Nije kliknuto unutar forme");



    }
}

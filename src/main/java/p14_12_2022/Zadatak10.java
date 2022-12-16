package p14_12_2022;

import java.util.Scanner;

public class Zadatak10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("unesi broj ");
        int a = s.nextInt();

        if (a % 2  == 0 && a % 3 == 0) {
            System.out.println("Broj je deljiv i sa dva i sa tri");}
        else if (a % 2 == 0) {
            System.out.println("Broj je samo sa dva");}
        else if (a % 3 == 0) {
                System.out.println("Broj je samo sa tri");}

            else System.out.println("Broj nije deljiv ni sa dva ni sa tri");



    }
}

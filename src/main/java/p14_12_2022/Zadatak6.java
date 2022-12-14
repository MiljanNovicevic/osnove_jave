package p14_12_2022;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("unesite a: ");
        int a = s.nextInt();
        System.out.println("unesite b: ");
        int b = s.nextInt();
        System.out.println("unesite c: ");
        int c = s.nextInt();


        if (a*a + b*b == c*c){
            System.out.println("Trougao je pravougli");}
        else {
            System.out.println("Trougao nije pravougli");}

    }
}

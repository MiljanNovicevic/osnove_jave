package p14_12_2022;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("unesite b: ");
        int b = s.nextInt();
        System.out.println("unesite c: ");
        int c = s.nextInt();
        System.out.println("unesite a: ");
        int a = s.nextInt();

        if (a >= b && b <= c){
        System.out.println("A je u opsegu izmedju " +  b + " " + c);}




    }
}

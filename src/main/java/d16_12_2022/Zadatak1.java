package d16_12_2022;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("unesite vrednost za x: ");
        int x = s.nextInt();
        int y = 1;
        for (int i = 1; i < 10; i++) {
            System.out.println(x +" x " + i + " = " + (x*i));

        }
    }
}

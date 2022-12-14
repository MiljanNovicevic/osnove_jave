package p14_12_2022;

import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int defaultJacina = 75;
        System.out.println("Jacina zvuka je " + defaultJacina);

        System.out.println("unesi komandu");
        String komanda = s.next();

        if (komanda.equals("pojacaj")) {
            System.out.println("Jacina zvuka je " + (defaultJacina + 10));
        } else if (komanda.equals("smanji")) {
            System.out.println("Jacina zvuka je " + (defaultJacina - 10));
        } else if (komanda.equals("mute")) {
            System.out.println("Jacina zvuka je " + (defaultJacina - 75));
        }


    }
}

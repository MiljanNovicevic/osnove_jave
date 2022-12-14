package p14_12_2022;

import java.util.Scanner;

public class Zadatak11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int defaultJacina = 75;
        System.out.println("Jacina zvuka je " + defaultJacina);

        System.out.println("unesi komandu");
        String komanda = s.next();

        if (komanda.equals("pojacaj")) {
            defaultJacina = defaultJacina + 10;
        } else if (komanda.equals("smanji")) {
            defaultJacina = defaultJacina - 10;
        } else if (komanda.equals("mute")) {
            defaultJacina = defaultJacina - 75;

        }

        if (defaultJacina < 0) {defaultJacina = 0;
        }
        else if (defaultJacina > 100) {defaultJacina= 100;}

        System.out.println("Nova jacina zvuka je " + defaultJacina);

    }
}

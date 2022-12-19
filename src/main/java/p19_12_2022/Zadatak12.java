package p19_12_2022;

import java.util.Scanner;

public class Zadatak12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite n: ");
        int n = s.nextInt();
        int suma = 0;



        for (int i = 0; i < n; i++) {
            int brojPoena = 0;
            System.out.println("Unesite sifru: ");
            String password = s.next();
            if (password.length() > 8) {
                brojPoena = brojPoena + 1;
            }
            if (password.contains("@")) {
                brojPoena = brojPoena + 1;
            }

            System.out.println("Password ima " + brojPoena + " poena");
            brojPoena = 0;
        }

    }
    }

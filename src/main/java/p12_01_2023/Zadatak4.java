package p12_01_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        ArrayList<Sastojak> sastojci = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite vrednost n: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite sastojak i cenu: ");
            Sastojak x = new Sastojak(s.next(),s.nextInt());
            sastojci.add(x);

        }



        for (int i = 0; i < sastojci.size(); i++) {
            System.out.println(sastojci.get(i).getNaziv());

        }
    }

}

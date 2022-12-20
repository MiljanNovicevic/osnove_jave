package p20_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String rec = "nista";

        while (!rec.contains(".")){
            System.out.println("unesite rec: ");
            rec = s.next();

            if (rec.contains("zajebava") ||
                    rec.contains("mars") ||
                    rec.contains("stoko") ||
                    rec.contains("svinjo")){
                System.out.println("beeeeeeeeeeeep");
            }

                            }
    }
}

package p26_12_2022;

import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite rimski broj od I do V: ");
        String x = s.next();
        int b = arapski(x);
        System.out.println("Arapski broj je: "+ b);






    }

    public static int arapski (String a) {
        if (a.equals("I")){
            return 1;
        }
        if (a.equals("II")){
            return 2;
        }
        if (a.equals("III")){
            return 3;
        }
        if (a.equals("IV")){
            return 4;
        }
        if (a.equals("V")){
            return 5;
        }
        return 0;
        }


    }






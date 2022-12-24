package p21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class UvodPetljeNizovi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList<Integer> brojevi = new ArrayList<Integer>();

        brojevi.add(40);
        brojevi.add(22);
        brojevi.add(15);
        brojevi.add(10);
        brojevi.add(85);

        for (int i = 0; i < brojevi.size(); i++) {
            System.out.print(brojevi.get(i) + ", ");

        }



    }
}

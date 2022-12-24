package p21_12_2022;

import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {
        System.out.println("POCETAK");

        ArrayList<Integer> brojevi = new ArrayList<Integer>();

        brojevi.add(40);
        brojevi.add(22);
        brojevi.add(15);
        brojevi.add(10);
        brojevi.add(85);

        int lastIndex = brojevi.size() - 1;
        int suma = brojevi.get(0) + brojevi.get(lastIndex);

        System.out.println("suma je: " + suma);

    }
}

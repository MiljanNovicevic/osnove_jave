package d26_12_2022;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite vrednost u Eur: ");
        int eur = s.nextInt();
        System.out.println("Unesite valutu: ");
        String valuta = s.next();

        double x = menjacnica(eur, valuta);
        System.out.println(eur + " EUR je " + x + " " +valuta);

    }

    public static double menjacnica(int eur, String valuta) {
        if (valuta.equals("RSD")){
            double kursRSD = 117.5;
            double rsd = eur * kursRSD;
            return rsd;

        }
        if (valuta.equals("USD")){
            double kursUSD = 1.1;
            double usd = eur * kursUSD;
            return usd;
        }
        if (valuta.equals("RUB")){
            double kursRUB = 62.98;
            double rub = eur * kursRUB;
            return rub;
        }
        return 0;

    }
}

package p20_12_2022;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int jacinaZvuka = 75;
        String komanda = "na";

        while (!komanda.contains("play")) {
            System.out.println("unesite komandu ");
            komanda = s.next();
                if (komanda.contains("pojacaj")){
               jacinaZvuka = jacinaZvuka + 10;
                System.out.println(jacinaZvuka);}
             else if (komanda.contains("smanji")) {
                jacinaZvuka = jacinaZvuka - 10;
                System.out.println(jacinaZvuka);
            }
            System.out.println("jacina zvuka " + jacinaZvuka);
        }


    }
}

package d19_12_2022;

import java.util.Scanner;
//Napisati program koji vodi evidenciju koliko je uneto sledecih reakcija. Korisnik unosi N rekacija zatim se prikazuje evidencija:
//Program podrzava sledece reakcije:
//like
//smile
//heart
public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite N: ");
        int n = s.nextInt();
        int likeBrojac = 0;
        int smileBrojac = 0;
        int heartBrojac = 0;


        for (int i = 0; i < n; i++) {
            System.out.println("Reaguj: ");
            String rec = s.next();

            if (rec.contains("like")){
                likeBrojac++;
            } else if (rec.contains("smile")) {
                smileBrojac++;
            } else if (rec.contains("heart")) {
                heartBrojac++;

            }

        }
        System.out.println("Summary: like " + likeBrojac + " | " + "smile: " + smileBrojac + " | " + "hear " + heartBrojac);
    }
}

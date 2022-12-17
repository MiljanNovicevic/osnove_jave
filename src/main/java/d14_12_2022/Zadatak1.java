package d14_12_2022;

import java.time.Year;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite ime: ");
        String ime = s.next();
        System.out.println("Unesite prezime: ");
        String prezime = s.next();
        System.out.println("Unesite godinu rodjenja: ");
        int godinaRodjenja = s.nextInt();
        int year = Year.now().getValue();
        int godine = (year - godinaRodjenja);

        System.out.println(ime + " " + prezime + " - " + godine + " god");


    }}

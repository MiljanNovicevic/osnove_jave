package p27_12_2022;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Racun racun1 = new Racun();
        racun1.brojRacuna = "213455-61351-1531581";
        racun1.imeIPrezime = "Miljan Novicevic";
        racun1.stanjeNaRacunu = 1000000;

        Racun racun2 = new Racun();
        racun2.brojRacuna = "16351-165195-1651";
        racun2.imeIPrezime = "Pera Peric";
        racun2.stanjeNaRacunu = 10500;

        System.out.println("Posiljalac");
        System.out.println(racun1.brojRacuna);
        System.out.println(racun1.imeIPrezime);
        System.out.println(racun1.stanjeNaRacunu);
        System.out.println("----------------------------");
        System.out.println("Primalac");
        System.out.println(racun2.brojRacuna);
        System.out.println(racun2.imeIPrezime);
        System.out.println(racun2.stanjeNaRacunu);

        System.out.println("Unesite sumu za transakciju: ");
        int sumaZaTransakciju = s.nextInt();
        racun1.stanjeNaRacunu = racun1.stanjeNaRacunu - sumaZaTransakciju;
        racun2.stanjeNaRacunu = racun2.stanjeNaRacunu + sumaZaTransakciju;

        System.out.println("Posiljalac");
        System.out.println(racun1.brojRacuna);
        System.out.println(racun1.imeIPrezime);
        System.out.println(racun1.stanjeNaRacunu);
        System.out.println("----------------------------");
        System.out.println("Primalac");
        System.out.println(racun2.brojRacuna);
        System.out.println(racun2.imeIPrezime);
        System.out.println(racun2.stanjeNaRacunu);


    }}

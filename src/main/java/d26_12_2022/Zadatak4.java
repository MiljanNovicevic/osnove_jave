package d26_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite jmbg: ");
        String jmbg = s.next();
        System.out.println("Unesite ime: ");
        String ime = s.next();
        System.out.println("Unesite prezime: ");
        String prezime = s.next();
        System.out.println("Unesite god rodjenja: ");
        String godRodjenja = s.next();
        System.out.println("Aktivan True or False: ");
        Boolean aktivan = s.nextBoolean();

        kosrisnikStampa(jmbg,ime,prezime,godRodjenja,aktivan);


    }

    public static void kosrisnikStampa(String jmbg, String ime, String prezime, String godRodjenja, Boolean aktivan) {
        System.out.println("JMBG: "+ jmbg);
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("God rodjenja: " + godRodjenja);
        System.out.println("Aktivan: " + aktivan);
    }

}

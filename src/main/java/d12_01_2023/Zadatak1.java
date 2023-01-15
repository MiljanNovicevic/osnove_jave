package d12_01_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {
        ArrayList<ZeleniKarton> zeleniKarton = new ArrayList<ZeleniKarton>();
        Scanner s = new Scanner(System.in);

        for (int i=0; i<=10; i++){
            System.out.println("Unesite ime i prezime studenta: ");
            String student = s.next();

            System.out.println("Unesite broj indeksa: ");
            String index = s.next();

            System.out.println("Unesite naziv predmeta: ");
            String predmet = s.next();

            System.out.print("Unesite ime i prezime profesora: ");
            String profesor = s.next();

            System.out.print("Unesite ocenu: ");
            int ocena = s.nextInt();

            ZeleniKarton x = new ZeleniKarton(student, index, predmet, profesor, ocena);
            zeleniKarton.add(x);
        }

        int brojPolozenih = 0;
        int zbirOcena=0;
        int brojPolozenih2 = 0;
        int zbirOcena2=0;

        for (int i=0; i<zeleniKarton.size();i++){
            zeleniKarton.get(i).print();
            System.out.println(zeleniKarton.get(i).getPredmet() + "- " + zeleniKarton.get(i).getOcena()+ '\n' +
                    zeleniKarton.get(i).getImeIPrezime() + zeleniKarton.get(i).getBrIndeksa() + zeleniKarton.get(i).getImeProfesora());
            brojPolozenih2++;
            zbirOcena2 = zeleniKarton.get(i).getOcena() +zbirOcena2;


            if (zeleniKarton.get(i).getOcena()>5 && zeleniKarton.get(i).getOcena()<=10) {
                brojPolozenih++;
                zbirOcena= zeleniKarton.get(i).getOcena() + zbirOcena;

            }

        }
        double avg = zbirOcena/brojPolozenih;
        System.out.println("Prosecna ocena za polozene ispite je: " + avg);
        double avg2 = zbirOcena2/brojPolozenih2;
        System.out.println("Prosecna ocena svih ispita je" + avg2);

    }
}

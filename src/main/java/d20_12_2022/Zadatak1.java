package d20_12_2022;

import java.util.Scanner;
//Napisati program koji ucitava brojeva od korisnika i za svaki broj prikazuje apsolutnu vrednost sve dok se ne unese nula.
public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = -1;

        while (a!=0){
            System.out.println("Unesite broj ");
            a = s.nextInt();
            if (a < 0){
                System.out.println(a = a * -1);
            }
            else if (a>=0){
                System.out.println(a);
            }
        }
        System.out.println("Kraj programa jer je uneta nula");
    }
}

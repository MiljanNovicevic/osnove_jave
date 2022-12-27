package d26_12_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
//Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije vraca novu vrednost koja se formira kao na primeru. METODA NISTA NE STAMPA.
//ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite prvi broj: ");
        int prvi = s.nextInt();
        System.out.println("Unesite drugi broj: ");
        int drugi = s.nextInt();


        int p = spajanjeBrojeva(prvi, drugi);
        System.out.println(p);







    }

    public static int spajanjeBrojeva(int x, int y) {
        x=x*10;
        int z = x+y;
        return z;





    }
}

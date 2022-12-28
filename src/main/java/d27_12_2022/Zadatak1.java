package d27_12_2022;

import java.util.Scanner;

//Napisati klasu Proizvod koja ima atribute
//naziv proizvoda (String)
//cenu proizvoda (double)
//težinu proizvoda u gramima. (double)
//	i metode:
//stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//konvertuj - metoda konvertuje tezinu u kilograme i tone. Metoda kao parametar prima jedinicu u koju zelimo da konvertujemo, a metoda vraca sracunatu vrednost. Jedinica moze biti “kg” ili “t”
//Primer: ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
//Primer: ako proizvod ima 12000 grama i pozovemo metodu sa parametrom t, metoda vraca 0.012
public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Proizvod proizvod1 = new Proizvod();
        proizvod1.naziv = "Kafa";
        proizvod1.cena = 150.5;
        proizvod1.tezina = 250;
        proizvod1.stampaj();

        Proizvod proizvod2 = new Proizvod();
        proizvod2.naziv = "Televizor";
        proizvod2.cena = 21550.2;
        proizvod2.tezina = 7500;
        proizvod2.stampaj();

        System.out.println("Prikazi tezinu u kilogramima (kg) ili tonama (t): ");
        String jedinica = s.next();
        proizvod1.konvertuj(jedinica);
        double a = proizvod1.konvertuj("t");
        double b = proizvod1.konvertuj("kg");

        System.out.println("U tonama: " + a);
        System.out.println("U kilogramima " + b);


    }
}

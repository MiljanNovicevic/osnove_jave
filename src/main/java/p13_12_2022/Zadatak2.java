package p13_12_2022;

import com.sun.org.apache.xpath.internal.objects.XString;

public class Zadatak2 {

    public static void main(String[] args) {
        String sifraProizvoda = "353248AB";
        String nazivProizvoda = "Nike360 Patike"  ;
        String cena = "$10500.50";
        String popust = "10%";
        String boja  = "Crna";
        double velicina = 45.5;

        System.out.println("Sifra " + sifraProizvoda);
        System.out.println(nazivProizvoda + " - " + cena + " - " + popust);
        System.out.println(boja + ", "  + velicina);

    }
}

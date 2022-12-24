package d20_12_2022;

import java.util.Scanner;
//Napisati program koji proverava uparenost zagrada. Korisnik unosi matematicku formulu sve dok ne unese znak =. Korisnik unosi svaki karakter jednacine posebno i
// na kraju programa se ispisuje da li su sve zagrade uparene.
//	Formula koja se koristi u primeru je: (2 * ( 1 + 3))=
public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

       String formula = "";
       int brojacOtv = 0;
       int brojacZat = 0;

       while (!formula.equals ("=")){
           System.out.println("Unos: ");
           formula = s.next();

           if (formula.equals("(")){
               brojacOtv++;
           } else if (formula.contains(")")) {
               brojacZat++;
           }


           }
        if (brojacOtv==brojacZat){
            System.out.println("zagrade su uparene");}
        else System.out.println("zagrade nisu uparene");
       }



    }


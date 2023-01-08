package xo_mini_projekat;

import java.util.Scanner;

public class main_XO_projekat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        XOTabla igra = new XOTabla();


        System.out.println("Unesite ime igraca X: ");                                                                   //ubaci skener na kraju za input imena
        igra.setImeXIgraca(s.next());
        System.out.println("Unesite ime igraca O: ");
        igra.setImeOIgraca(s.next());

        igra.pokreniIgru();

        while (!igra.popunjenaTabla() && !igra.pobednikX() && !igra.pobednikO()){
            igra.stampaj();
            System.out.print("Izaberite polje od 1 do 9 koje zelite da odigrate: ");
            int polje = s.nextInt();


        while (!igra.poljePrazno(polje)){
            if (polje > 9 || polje < 1){
                System.out.print("Polje ne postoji, ponovite unos od 1 do 9: ");
            } else {
                    System.out.print("Izabrano polje je popunjeno. Ponovite unos: ");
                }
                polje = s.nextInt();
            }

            igra.setInputXO(igra.getNaPotezu());

            igra.odigrajPotez(polje);

            if (igra.pobednikX()){
                System.out.println();
                System.out.println("Pobednik je igrac " + igra.getNaPotezu() + ". Bravo " + igra.getImeXIgraca() + "!");
                igra.stampaj();
            } else if (igra.pobednikO()) {
                System.out.println();
                System.out.println("Pobednik je igrac " + igra.getNaPotezu() + ". Bravo " + igra.getImeOIgraca() + "!");
                igra.stampaj();
            } else if (igra.popunjenaTabla()){
                System.out.println();
                System.out.println("Rezultat je neresen. Za novu igru pokrenite ponovo program");
                igra.stampaj();
            }
            igra.zameniIgraca();
        }



    }



    }


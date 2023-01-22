package p19_01_2023;

import p17_01_2023.JednakostranicniTrougao;
import p17_01_2023.Pravougaonik;

import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {

        JednakostranicniTrougao t1 = new JednakostranicniTrougao(5);
        Pravougaonik p1 = new Pravougaonik(5, 15);

        t1.stampaj();
        p1.stampaj();

        Figura x1 = new p19_01_2023.Pravougaonik(10, 20);
        Figura x2 = new p19_01_2023.JednakostranicniTrougao(4);
        Figura x3 = new p19_01_2023.JednakostranicniTrougao(7);
        Figura x4 = new p19_01_2023.JednakostranicniTrougao(9);
        Figura x5 = new p19_01_2023.Pravougaonik(15, 32);

        ArrayList<Figura> figura = new ArrayList<>();
        figura.add(x1);
        figura.add(x2);
        figura.add(x3);
        figura.add(x4);
        figura.add(x5);

        double obimZbir = 0;
        double povrsinaZbir = 0;

        for (int i = 0; i < figura.size(); i++) {
            obimZbir = obimZbir + figura.get(i).obim();

        }
        System.out.println("Obim svih " + obimZbir);

        for (int i = 0; i < figura.size(); i++) {
            povrsinaZbir = povrsinaZbir + figura.get(i).povrsina();
        }
        System.out.println("povrsina svih " + povrsinaZbir);
    }
}
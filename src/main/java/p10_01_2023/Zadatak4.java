package p10_01_2023;

public class Zadatak4 {
    public static void main(String[] args) {
        Korisnik a = new Korisnik("miljan","novicevic");


        FacebookPost b = new FacebookPost();
        b.setOpis("Ovo je opis");
        b.setKorisnik("Milan");
        b.setJeKorisnik(a);

        b.print();


    }
}

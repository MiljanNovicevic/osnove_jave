package d19_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        Ambalaza tetrapak1 = new Tetrapak("123456-78564", "Jogurt", 1000, 1200, true, 140);
        tetrapak1.stampaj();

        Ambalaza staklo1 = new StaklenaAmbalaza("798456-123", "Zajecarsko", 500, 800,
                50, true, 130);
        staklo1.stampaj();


        SuperKartica kartica = new SuperKartica("4168465184165181", "Pera", 150);

        Korpa korpa = new Korpa();
        korpa.dodajAmbalazu(tetrapak1);
        korpa.dodajAmbalazu(staklo1);
        System.out.println("Ukupna vrednost/cena korpe: " + korpa.cenaKorpe(kartica));
    }

}

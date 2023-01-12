package p12_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        Korisnik n = new Korisnik();
        n.setImeIPrezime("Miljan Novicevic");
        n.pretplatiSe(150);


        Korisnik m = new Korisnik();
        m.setImeIPrezime("Pera Peric");



        ZoomCall y = new ZoomCall("zoom.us/a1920832190831", "12938ahse78",n,m);
        y.setGuest(m);
        y.pokreniPoziv();

    }
}

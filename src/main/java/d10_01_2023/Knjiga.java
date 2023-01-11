package d10_01_2023;

public class Knjiga {
    private String isbn;
    private String naziv;
    private int godIzdanja;
    private Autor autorKnjige;
    public Knjiga(){

    }

    public Knjiga(String isbn, String naziv, int godIzdanja, Autor autorKnjige) {
        this.isbn = isbn;
        this.naziv = naziv;
        this.godIzdanja = godIzdanja;
        this.autorKnjige = autorKnjige;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getGodIzdanja() {
        return godIzdanja;
    }

    public Autor getAutorKnjige() {
        return autorKnjige;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setGodIzdanja(int godIzdanja) {
        this.godIzdanja = godIzdanja;
    }

    public void setAutorKlasa(Autor autorKlasa) {
        this.autorKnjige= autorKlasa;
    }


    public void print(){
        System.out.println("ISBN: " + this.isbn);
        System.out.println(this.naziv + " - " + this.godIzdanja + ". godine.");
        this.autorKnjige.stampa();
        System.out.println();
    }
}

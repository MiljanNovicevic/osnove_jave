package p10_01_2023;

public class User {

    private String ime;
    private String prezime;
    private String email;

    public User (String email){
        this.email=email;
    }

    public User(){
        System.out.println("Pozvao se konstruktor");


    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getEmail() {
        return email;
    }
}

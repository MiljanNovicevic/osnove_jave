package p12_01_2023;

public class ZoomCall {
    private String url;
    private String password;
    private Korisnik host;
    private Korisnik guest;

    public String getUrl() {
        return url;
    }

    public String getPassword() {
        return password;
    }

    public Korisnik getHost() {
        return host;
    }

    public Korisnik getGuest() {
        return guest;
    }

    public void setGuest(Korisnik guest) {
        this.guest = this.guest;
    }


    public ZoomCall(){
    }
    public ZoomCall (String link, String password, Korisnik host){
        this.url = link;
        this.password = password;
        this.host = host;
            }
    public ZoomCall (String link, String password, Korisnik host, Korisnik guest){
        this.url = link;
        this.password = password;
        this.host = host;
        this.guest = guest;
    }
    public void pokreniPoziv(){
        System.out.println("Zoom link: " + this.url);
        System.out.println("Password " + this.password);
        System.out.println("Host: " + this.host.getImeIPrezime());
        if (this.guest != null){
        System.out.println("Guest: " + this.guest.getImeIPrezime());}
    }




}

package p27_12_2022;

public class Auto {
    public String imeIPrezime;
    public String marka;
    public int brojVrata;
    public double potrosnja;
    public int brzina;
    public int godinaProizvodnje;
    public int mesecReg;
    public int kubikaza;



    public void stampajAuto(){
        System.out.println(this.imeIPrezime);
        System.out.println(this.marka + " " + this.brojVrata + "-oro vrata");
        System.out.println("Sa potrosnjom od " + this.potrosnja + "l na 100km");
        System.out.println(this.brzina + " km/h je trenutna brzina");

    }

    public boolean prekoracenje(){
        int ogranicenje = 100;
        boolean prekoracenje = false;

        if ((this.brzina-ogranicenje)>0){
            System.out.println("Brzina je prekoracena");
            int kazna = (this.brzina-ogranicenje)*1000;

                    }

        return prekoracenje;
    }



        }



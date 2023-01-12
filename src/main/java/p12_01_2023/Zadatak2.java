package p12_01_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        FizickoLice kupac = new FizickoLice("Miljan Novicevic","218564","1351698156165",true);
        FizickoLice prodavac = new FizickoLice("Pera Peric", "417815","16546165561798",false);

        Ugovor n = new Ugovor("15.01.2023",prodavac,1400000,"Niska 15",kupac);
        n.stampa();



    }
}

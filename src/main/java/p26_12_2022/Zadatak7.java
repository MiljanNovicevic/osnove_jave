package p26_12_2022;

public class Zadatak7 {
    public static void main(String[] args) {
//Napisati metodu koja vraca suprotno negativni broj od prosledjenog. Metoda prima broj N i vraca ga sa negativnom vrednoscu.
//Primer: Ako se metoda pozove za N=10, vraca -10
//	Ako se metoda pozove za N=-11, vraca 11
    int x = suprotni(20);
        System.out.println(x);



    }

    public static int suprotni(int x) {
        if (x!=0){
            return x*-1;
        } else if (x==0) {
            return x=0;
        }
        return 0;

    }
}

package d14_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite vrednost X ");
        int x = s.nextInt();


        if (x < 2){
           int y=x;
            System.out.println("y = " + y);}
        else if (x>=2 && x<=10) {
            int y = 2;
            System.out.println("y = " + y);
        }
        else if (x>10){
            int y = x-1;
            System.out.println("y = " + y);}




    }
}

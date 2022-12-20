package p20_12_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int broj= 1;
        int counter = 0;


        while (counter < 2){
            System.out.println("Unesite broj ");
            broj = s.nextInt();
            if (broj==0){
            counter = counter + 1;
            }


            }
        System.out.println("Uneli ste dve nule");



        }



    }


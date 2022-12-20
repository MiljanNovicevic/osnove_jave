package p20_12_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int broj = 0;
        int counter1= 0;
        int counter2= 0;
        int counter3= 0;
        int counter4= 0;


        while (counter1 == 0 || counter2==0 || counter3==0 || counter4 == 0){
            System.out.println("Unesite broj ");
            broj = s.nextInt();
            if (broj==1){
                counter1++;
                }
            if (broj==2){
                counter2++;
                }
            if (broj==3){
                counter3++;
            }
            if (broj==4){
                counter4++;
            }

            }
        System.out.println("Uneli ste 1, 2, 3, 4");

            }




        }






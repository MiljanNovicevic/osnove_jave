package p26_12_2022;

public class Zadatak8 {
    public static void main(String[] args) {
        boolean trougao = jePravougli(3,4,5);

        if (trougao= true) {
            System.out.println("Jeste pravougli");
        } else {
            System.out.println("nije pravougli");
        }

    }


        public static boolean jePravougli (int a, int b, int c) {
            if (a*a + b*b == c*c){
                return  true;
            }
            else {
                return  false;

            }


        }




    }




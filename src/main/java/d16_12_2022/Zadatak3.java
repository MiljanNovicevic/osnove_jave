package d16_12_2022;

public class Zadatak3 {
    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0){
                System.out.println(-i);
            } else if (i % 2 != 0) {
                System.out.println(i);

            }
        }
    }
}

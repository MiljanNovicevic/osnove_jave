package p21_12_2022;

import java.util.ArrayList;

public class UvodArrays {
    public static void main(String[] args) {
        System.out.println("POCETAK");

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        System.out.println(cars.size()); //ovo na govori koliko je u tom trenutku itema ucitano u array
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        cars.set(0, "Audi");

        String prvi = cars.get(0);
        System.out.println(prvi);
    }
}

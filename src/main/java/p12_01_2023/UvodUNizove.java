package p12_01_2023;

import java.util.ArrayList;

public class UvodUNizove {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();

        User m = new User("Miljan", "Novicevic");
        User n = new User("Pera", "Peric");

        users.add(m);
        users.add(n);

    }
}

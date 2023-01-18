package p17_01_2023;

import p16_01_2023.MasterKartica;
import p16_01_2023.VisaKartica;

public class Zadatak1 {
    public static void main(String[] args) {

        p16_01_2023.VisaKartica visa1 = new VisaKartica(205000, "126351651651", "2026","12");
        p16_01_2023.MasterKartica master1 = new MasterKartica(50000, "129819819812", "2024","08");

        visa1.stampaj();
        master1.stampaj();

    }
}

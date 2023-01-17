package p16_01_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        VisaKartica visa1 = new VisaKartica(205000, "126351651651", "2026","12");
        MasterKartica master1 = new MasterKartica(50000, "129819819812", "2024","08");

        visa1.stampaj();
        master1.stampaj();

    }
}

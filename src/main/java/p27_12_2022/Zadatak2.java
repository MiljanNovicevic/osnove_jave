package p27_12_2022;

public class Zadatak2 {
    public static void main(String[] args) {

        SlackMessage poruka1 = new SlackMessage();
        poruka1.tekstPoruke = "Cao, kako si?";
        poruka1.imeIPrezime = "Miljan Novicevic";
        poruka1.datumIVreme = "27.12.2022 20:13";
        poruka1.stampaj();

        SlackMessage poruka2 = new SlackMessage();
        poruka2.tekstPoruke = "Cao, gde si ti?";
        poruka2.imeIPrezime = "Pera Peric";
        poruka2.datumIVreme = "27.12.2022 22:13";
        poruka2.stampaj();


    }
}

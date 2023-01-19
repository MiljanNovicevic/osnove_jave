package d17_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {
    TimeControl tc = new TimeControl();
    AudioControl ac = new AudioControl();
    QualityOptimizerControl qoc = new QualityOptimizerControl();

        VideoPlayer a = new VideoPlayer(240, 120, 75, 144);
        a.stampaj();

        tc.izvrisAkciju(a);
        ac.izvrisAkciju(a);
        qoc.izvrisAkciju(a);

        a.stampaj();





    }
}

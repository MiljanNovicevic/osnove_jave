package p17_01_2023;

public class JednakostranicniTrougao extends Figura{
    private double a;

    public JednakostranicniTrougao(int stranicaA) {
        this.a= stranicaA;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double povrsina() {
        return (a * a) * 1.73205 / 4;
    }
    public double obim(){
        return a*3;
    }


}

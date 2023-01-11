package p10_01_2023;

public class tacka {

    private String x;
    private String y;

        public tacka() {
        }

        public tacka(String x, String y){
        this.x = x;
        this.y = y;
            }

    public void stampaj() {
        System.out.println(this.x + "--------" + this.y);
    }

    public String getX() {
        return x;
    }

    public String getY() {
        return y;
    }

    public void setX(String x) {
        this.x = x;
    }

    public void setY(String y) {
        this.y = y;
    }
}

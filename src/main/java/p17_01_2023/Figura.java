package p17_01_2023;

public abstract class Figura {

    public abstract double povrsina();
    public abstract double obim();

    public void stampaj(){
        System.out.println("povrsina je " + povrsina());
        System.out.println("Obim je " + obim());
    }

}
